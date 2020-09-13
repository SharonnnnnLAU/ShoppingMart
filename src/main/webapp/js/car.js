layui.use(["table", "util", "form", "layedit", "laytpl"], function () {
  var table = layui.table,
      util = layui.util,
      form = layui.form,
      laytpl = layui.laytpl,
      layedit = layui.layedit;
  $ = layui.$;

  var scid = localStorage.getItem("SCID")
  // 渲染表格
  var scTableIns = table.render({
    display: [],
    elem: '#shoppingcar',
    url: 'http://localhost:8080/SC/listSC?scid=' + scid,
    toolbar: '#shca_toolbar',
    totalRow: false,
    skin: "line",
    limits: [15, 20, 25, 30, 10],
    id: 'scTableIns',
    cols: [
      [
        {type: 'checkbox', fixed: 'left'},
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
          field: 'gnum',
          minWidth: 100,
          align: 'center'
        },
        {
          fixed: 'right',
          align: 'center',
          toolbar: '#shca_option',
          width: 55
        }
      ]
    ]
  });

  table.resize('scTableIns');

  //监听头工具栏事件
  table.on('toolbar(shoppingcar_event)', function(obj){
    var checkStatus = table.checkStatus(obj.config.id)
        ,data = checkStatus.data; //获取选中的数据
    switch(obj.event){
      case 'getCheckData':
        var data = checkStatus.data;  //获取选中行数据
        layer.alert(JSON.stringify(data));
        break;
    };
  });

  // 监听行工具事件
  table.on('tool(shoppingcar_event)', function (obj) {
    var data = obj.data,
        layEvent = obj.event;
    // console.log("in good_list_event")
    switch (layEvent) {
      case 'detail':
        debugger
        // console.log(data)
        showgoodsDetail($, laytpl, data)
        break;
    }
  });

  // 弹出并渲染商品详情页
  function showgoodsDetail($, laytpl, data) {
    // console.log(data)
    // console.log(data.gid)
    // console.log(data.gimg)
    let id = data.gid;
    // console.log(id)
    $.ajax({
      type: "get",
      url: "http://localhost:8080/Good/goodsDetail?gId=" + id,
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
        error(function () {
          console.log("failed")
        })
      }
    });
  }

});
