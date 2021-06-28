<template>
  <div>
    <div style="margin-bottom: 20px;">
      <el-row>
        <el-col :span="20" style="padding-left: 20px;">
          <el-row>
            <el-col :span="20" style="padding-left: 20px;text-align: left">
              <label for="studentname"></label>
              <el-input id="studentname"
                        placeholder="可以通过学生姓名搜索学生..."
                        prefix-icon="el-icon-search"
                        v-model="studentsearch" style="width: 400px" size="small"
              ></el-input>
            </el-col>
            <el-col :span="4">
              <el-button type="primary" icon="el-icon-search" size="small">搜索</el-button>
            </el-col>
          </el-row>
        </el-col>
        <el-col :span="4">
          <el-button type="primary" icon="el-icon-circle-plus" size="small">添加学生</el-button>
        </el-col>
      </el-row>
    </div>
    <div>
      <el-table
          :data="studentList"
          size="mini"
          stripe
          v-loading="tableLoading"
          style="width: 100%">
        <el-table-column  prop="name"   align="center" fixed label="名称" width="150"> </el-table-column>
        <el-table-column prop="age" align="left" fixed  label="年龄"   width="100"> </el-table-column>
        <el-table-column prop="gender" align="left" fixed  label="性别"   width="100"> </el-table-column>
        <el-table-column label="" align="right">
          <template slot-scope="scope">
              <el-button
                size="mini"  class="el-icon-edit" type="primary"
                @click="handleEdit(scope.$index, scope.row)">
            </el-button>

            <el-button
                size="mini"
                class="el-icon-delete" type="danger"
                @click="handleDelete(scope.$index, scope.row)">
            </el-button>
          </template>
        </el-table-column>
      </el-table>

    </div>
  </div>

</template>

<script>
export default {
  name:"studentlist",
  mounted: function () {
    this.loadStudentsList();
  },
  data(){
    return{
      studentList:[
        {
          "name":"test1",
          "age":18,
          "gender":"男"
        },{
          "name":"test2",
          "age":18,
          "gender":"男"
        },{
          "name":"test3",
          "age":18,
          "gender":"男"
        },{
          "name":"test4",
          "age":18,
          "gender":"男"
        }
      ],
      studentname:""
    }
  },
  methods:{
    loadStudentsList(){
      // this.$getRequest();
    }
  }
}
</script>

<style>

</style>