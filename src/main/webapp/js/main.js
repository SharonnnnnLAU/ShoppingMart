var table, util, form, laytpl, $;
layui.use(["table", "util", "form", "layedit", "laytpl"], function () {
  table = layui.table;
  util = layui.util;
  form = layui.form;
  laytpl = layui.laytpl;
  $ = layui.$;
});

const BASE_URL = "http://localhost:8080";

// 执行完成消息提示
function showMsg(content, icon) {
  layer.msg(content, {
    time: 3000,
    icon: icon,
    offset: 'rt',
    area: '320px'
  });
}

// 行工具栏监听事件删除操作
function lineDel(obj, url) {
  layer.confirm('确认删除当前行吗?（该操作不可逆）', function (index) {
    layer.close(index);
    $.ajax({
      type: "get",
      url: url,
      dataType: "json",
      xhrFields: {
        withCredentials: true
      },
      success: function (res) {
        if (res.code == 0) { // 成功
          showMsg("删除一行成功", 1);
        } else { // 请求失败
          showMsg(res.msg, 2);
        }
      }
    })
    obj.del();
  });
}

// 头工具栏监听事件删除操作
function toolBarDel(ids, url) {
  if (ids.length === 0) {
    showMsg('请至少选择一行', 7);
  } else {
    layer.confirm('确认删除这些行吗?（该操作不可逆）', function (index) {
      layer.close(index);
      $.ajax({
        type: "post",
        url: url,
        data: {
          "ids": ids
        },
        dataType: "json",
        xhrFields: {
          withCredentials: true
        },
        traditional: true,
        success: function (res) {
          if (res.code == 0) { // 成功
            showMsg("删除 " + res.data + " 行数据成功", 1);
          } else { // 请求失败
            showMsg(res.msg, 2);
          }
          $('.layui-laypage-btn').click();
        }
      })
    });
  }
}

function reloadTable(tableIns, data) {
  tableIns.reload({
    where: data,
    page: {
      curr: 1
    }
  })
}