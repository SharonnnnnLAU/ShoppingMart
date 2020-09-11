// layui.config({
//   base: '../layui_exts/' //配置 layui 第三方扩展组件存放的基础目录
// }).extend({
//   laymock:'laymock/laymock', //mock数据
//   layfilter:'layfilter/layfilter'
// });

layui.use(["table", "util", "form", "layedit", "laytpl"], function () {
  var table = layui.table,
      util = layui.util,
      form = layui.form,
      laytpl = layui.laytpl,
      layedit = layui.layedit;
  $ = layui.$;

  // 渲染表格
  var goodsTableIns = table.render({
    display: [],
    elem: '#goods_list',
    url: 'http://localhost:8080/Good/listGood',
    totalRow: false,
    skin: "line",
    limits: [15, 20, 25, 30, 10],
    cols: [
      [
        {
          field: 'gimg',
          minWidth: 100,
          align: 'center',
          templet: function (d) {
            var path = d.gimg;
            // console.log(path);
            return "<img src=../" + path + " style='height: auto; width: 100% ' />"
          }
        },
        {
          field: 'gname',
          align: 'center',
          minWidth: 150,
        },
        {
          field: 'gprice',
          align: 'center',
          minWidth: 150,
        },
        {
          field: 'gtype',
          minWidth: 100,
          align: 'center',
          templet: function (d) {
            if (d.gtype == 0) {
              // console.log("COAT");
              return 'COAT';
            } else if (d.gtype == 1)
              return 'PLANTS';
            else if (d.gtype == 2)
              return 'SHIRT';
            else if (d.gtype == 3)
              return 'SHOE';
            else if (d.gtype == 4)
              return 'SKIRT';
          }
        },
        {
          fixed: 'right',
          align: 'center',
          toolbar: '#good_list_option',
          width: 55
        }
      ]
    ]
  });

  /**
   * 商品类型 0:coat 1:plants 2:shirt 3:shoes 4:skirt
   */

  // 监听行工具事件
  table.on('tool(good_list_event)', function (obj) {
    var data = obj.data,
        layEvent = obj.event;
    console.log("in good_list_event")
    switch (layEvent) {
      case 'detail':
        debugger
        console.log("detail")
        showgoodsDetail($, laytpl, data)
        break;
    }
  });

  // 弹出并渲染课程详情页
  function showgoodsDetail($, laytpl, data) {
    var id = data.gId;
    console.log(data)
    console.log(id)
    $.ajax({
      type: "get",
      url: "http://localhost:8080/goods/goodsDetail?gId=" + id,
      dataType: "json",
      xhrFields: {
        withCredentials: true
      },
      success: function (res) {
        console.log(res.data)
        var cnt, d = res.data,
            goodsDetail = goods_detail.innerHTML;
        laytpl(goodsDetail).render(d, function (html) {
          cnt = html;
        })
        if (res.code == 0) { // 成功
          layer.open({
            type: 0,
            title: ["详细信息", 'font-size:18px;'],
            content: cnt,
            area: ["60%", "60%"]
          })
        } else { // 请求失败
          showMsg(res.msg, 2);
        }
      }
    });
  }

});
