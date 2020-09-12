var tool={
    success: 200,
    baseUrl: "http://localhost:9011",

    /*request 请求*/
    request: function (url, type, params, fun) {
        var _this = this;
        $.ajax({
            url: this.baseUrl+url,
            type: type,
            dataType: 'json',
            data: params,

            error: function (err) {
                console.log(err);
                window.alert("未知异常");
            },
            success: function (data) {
                var status = data.status;
                if (_this.success == status){
                    fun(data.obj);
                }else {
                    window.alert(data.msg);
                    var code = data.code;
                    if (code === 403){
                        window.location.href="login.html";
                    }
                }
            }
            }

        );

    }


}