<template>
  <div>
    用户名:<input type="text" v-model="registerForm.username" placeholder="请输入用户名"/>
    <br><br>
    密码： <input type="password" v-model="registerForm.password" placeholder="请输入密码"/>
    <br><br>
    <button v-on:click="register">注册</button>
  </div>
</template>

<script>

    export default {
        name: 'Register',
        data () {
            return {
                registerForm: {
                    username: 'admin',
                    password: ''
                },
                responseResult: []
            }
        },
        methods: {
            register () {
                this.$axios
                    .post('/register', {
                        username: this.registerForm.username,
                        password: this.registerForm.password
                    })
                    .then(successResponse => {
                        if (successResponse.data.code === 200) {
                            this.$router.replace({path: '/index'})
                        }
                    })
                    .catch(failResponse => {
                    })
            }
        }
    }
</script>

<style scoped>

</style>
