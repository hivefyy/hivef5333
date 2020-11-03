<template>
  <div class="title">
      <el-table :data="userlist"  border style="width: 100%">
      <el-table-column fixed label="ID"   prop="id"  width="180"></el-table-column>
      <el-table-column  label="姓名"  prop="username"  width="180"></el-table-column>
      <el-table-column  label="密码"  prop="password" ></el-table-column>

      <el-table-column      fixed="right"      label="操作"      width="100">
        <template slot-scope="scope">
          <el-button  @click="deleteuser(scope.row)" size="small"  type="text">删除</el-button>
          <el-button size="small" type="text">修改</el-button>
        </template>
      </el-table-column>
      </el-table>

    <!--分页的代码-->
    <el-pagination  @size-change="handleSizeChange" @current-change="handleCurrentChange"
                    class="fy"
                   layout="prev, pager, next"
                   :total="total"
                   background
    >
    </el-pagination>
  </div>
</template>

<script>
    export default {
        name: "UserInfo",
        data() {
            return {
                currentPage:1,
                pagesize:10,
                total: 1000,
               userlist: []
            }
        },
        created() {
            this.findall();
        },
        methods: {
            //查找用户所有信息
            findall(){
                this.$axios
                    .get('/userinfo', {
                    })
                    .then(successResponse => {
                        this.userlist = successResponse.data
                    })
                    .catch(failResponse => {
                    })
                },
            //删除单个用户信息
            deleteuser(row){
                console.log(row)
                this.$axios
                    .post('/deleteuser',{
                        id: row.id
                    })
                    .then(successResponse => {
                        if (successResponse.data.code===303){
                            location.reload()
                        }
                    })
                    .catch(failResponse => {

                })
            },
            // 监听 pagesize 改变的事件
            handleSizeChange(newSize) {
                this.query.pageSize = newSize;
                this.getUserList()
            },
            // 监听 页码值 改变的事件
            handleCurrentChange(newPage) {
                this.query.currentPage = newPage;
                this.getUserList()
            }
            }


    }
</script>

<style scoped>

</style>
