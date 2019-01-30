function login_form()
{
    var userName = $("#userName").val();
    var password = $("#password").val();
    // 账号为空
    if (userName == null || userName == "") {
        alert("请输入账号");
        return;
    }
    if (password == null || password == "") {
        alert("请输入密码");
        return;
    }
    $("#login_form").submit();
    // $.ajax({
    //     type : 'post',
    //     url : 'http://localhost:8080/userInfo/queryUser',
    //     headers : {'Accept': 'application/json; charset=utf-8'},
    //     data : {userName : userName, password : password},
    //     dataType : 'json',
    //     success : function (data) {
    //         if (data.result = 'success') {
    //             $.ajax({type : 'post', url : 'http://localhost:8080/login'})
    //         } else {
    //             alert(data.message);
    //         }
    //     }, error : function () {
    //         alert("处理异常!")
    //     }
    // })
}

function disp_confirm(message, yes, no)
{
    var r=confirm(message);
    if (r==true)
    {
        document.write(yes);
    }
    else
    {
        document.write(no);
    }
}