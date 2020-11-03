<template>
  <div>
    用户名:<input type="text" v-model="loginForm.username" placeholder="请输入用户名"/>
    <br><br>
    密码： <input type="password" v-model="loginForm.password" placeholder="请输入密码"/>
    <br><br>
    <button v-on:click="login">登录</button>
    <span @click="register">  马上注册</span>
  </div>
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


</style>
