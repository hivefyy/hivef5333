<template>
  <el-form class="login-container" label-position="left"
           label-width="0px">
    <h3 class="login_title">系统登录</h3>
    <el-form-item>
      <el-input type="text" v-model="loginForm.username"
                auto-complete="off" placeholder="请输入用户名"></el-input>
    </el-form-item>
    <el-form-item>
      <el-input type="password" v-model="loginForm.password"
                auto-complete="off" placeholder="请输入密码"></el-input>
    </el-form-item>
    <el-form-item style="width: 100%">
      <el-button type="primary" style="width: 100%;background: #505458;border: none" v-on:click="login">登录</el-button>
      <el-link type="info" @click="register">  马上注册</el-link>
    </el-form-item>
  </el-form>

</template>

<script>

    export default {
        name: 'Login',
        data () {
            return {
                loginForm: {
                    username: 'admin',
                    password: ''
                },
                responseResult: []
            }
        },
        methods: {
            login () {
                this.$axios
                    .post('/login', {
                        username: this.loginForm.username,
                        password: this.loginForm.password
                    })
                    .then(successResponse => {
                        if (successResponse.data.code === 200) {
                            this.$message('登录成功');
                            this.$router.replace({path: '/userinfo'})
                        }
                        else {
                            this.$message('登录失败，账号或密码错误')
                        }
                    })
                    .catch(failResponse => {
                    })
            },
            register(){
                this.$router.replace({path: '/register'})
            }
        }
    }
</script>

<style scoped>
  .login-container {
    border-radius: 15px;
    background-clip: padding-box;
    margin: 90px auto;
    width: 350px;
    padding: 35px 35px 15px 35px;
    background: #fff;
    border: 1px solid #eaeaea;
    box-shadow: 0 0 25px #cac6c6;
  }

  .login_title {
    margin: 0px auto 40px auto;
    text-align: center;
    color: #505458;
  }


</style>
