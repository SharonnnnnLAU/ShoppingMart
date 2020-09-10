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
    elem: '#type_plants',
    url: 'http://localhost:8080/Good/plantsType',
    totalRow: false,
    skin: "line",
    limits: [15, 20, 25, 30],
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
      ]
    ]
  });

  // 弹出并渲染课程详情页
  // function showgoodsDetail($, laytpl, data) {
  //   var id = data.gId;
  //   // console.log(data)
  //   // console.log(id)
  //   $.ajax({
  //     type: "get",
  //     url: "http://localhost:8080/goods/goodsDetail?csId=" + id,
  //     dataType: "json",
  //     xhrFields: {
  //       withCredentials: true
  //     },
  //     success: function (res) {
  //       // console.log(res.data)
  //       var cnt, d = res.data,
  //           goodsDetail = goods_detail.innerHTML;
  //       laytpl(goodsDetail).render(d, function (html) {
  //         cnt = html;
  //       })
  //       if (res.code == 0) { // 成功
  //         layer.open({
  //           type: 0,
  //           title: ["详细信息", 'font-size:18px;'],
  //           content: cnt,
  //           area: ["60%", "60%"]
  //         })
  //       } else { // 请求失败
  //         showMsg(res.msg, 2);
  //       }
  //     }
  //   });
  // }

});
