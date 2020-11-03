<template>
  <el-table :data="userlist"  border style="width: 100%">
    <el-table-column fixed label="ID"   prop="id"  width="180"></el-table-column>
    <el-table-column  label="姓名"  prop="username"  width="180"></el-table-column>
    <el-table-column  label="密码"  prop="password" ></el-table-column>

    <el-table-column      fixed="right"      label="操作"      width="100">
      <template slot-scope="scope">
        <el-button  size="small" type="text">删除</el-button>
        <el-button size="small" type="text">修改</el-button>
      </template>
    </el-table-column>


  </el-table>
</template>

<script>
    export default {
        name: "UserInfo",
        data() {
            return {
                userlist: []
            }
        },
        created() {
            this.findall();
        },
        methods: {
            findall(){
                this.$axios
                    .get('/userinfo', {
                    })
                    .then(successResponse => {
                        console.log()
                            this.userlist = successResponse.data
                    })
                    .catch(failResponse => {
                    })
                }
            }

    }
</script>

<style scoped>

</style>
