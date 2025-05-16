

<template>
	<div class="edit-page-div">
		<div class="box-card">
			<h2 class="edit-page-div-h2">供应商信息-新增</h2>
			<div class="edit-form-div" id="gysNameForm">
				<div  class="edit-form-name">供应商名</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入供应商名" name="gysName" v-model="gysName" class="" id="gysName"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="gysCelForm">
				<div  class="edit-form-name">供应商电话</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入供应商电话" name="gysCel" v-model="gysCel" class="" id="gysCel"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="gysAddressForm">
				<div  class="edit-form-name">供应商地址</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入供应商地址" name="gysAddress" v-model="gysAddress" class="" id="gysAddress"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="remarkForm">
				<div  class="edit-form-name">备注</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入备注" name="remark" v-model="remark" class="" id="remark"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-page-div-btn">
				<el-button type="primary" @click="submitData" >提交</el-button>
				<el-button type="default" onclick="javascript:history.back(-1);"  >返回</el-button>
			</div>
		</div>
	</div>
</template>

<script>
import $ from 'jquery'
import {utils} from '../../../assets/listutils.js'
import {admin_utils} from '../../../assets/admin/admin_utils.js'
export default {
	components: {
	},
	data() {
		return {
			currentLoginToken:'',
			gysName:'',
			gysCel:'',
			gysAddress:'',
			remark:'',
		};
	},
	mounted() {
		var that = this;
		that.currentLoginToken=utils.getCookie('loginToken');
	},
	methods:{
		submitData(){
			var that = this;
			var gysName = that.gysName;
			var gysCel = that.gysCel;
			var gysAddress = that.gysAddress;
			var remark = that.remark;
			$.ajax({
				type : 'post',
				url : this.REQUEST_URL+"/staff/gys_msg/add1_submit",
				async: false,
				data : {
					'gysName':gysName,
					'gysCel':gysCel,
					'gysAddress':gysAddress,
					'remark':remark,
					'loginToken':that.currentLoginToken,
				},
				success : function(result) {
					alert(result.msg);
					if(result.code==1){
						that.$router.go(-1);
					}
				}
			});
		},
	}
};

</script>
<style scoped>
	.edit-page-div {
	background: #f8fafc;
	min-height: 100vh;
	padding: 30px;
	}
	/* 主卡片容器 */
	.box-card {
	max-width: 1000px;
	margin: 0 auto;
	border-radius: 12px;
	box-shadow: 0 6px 18px rgba(62, 86, 206, 0.08);
	background: linear-gradient(145deg, #ffffff 0%, #f9fbfd 100%);
	}
	/* 标题样式 */
	.edit-page-div-h2 {
	color: #2d3441;
	font-size: 24px;
	text-align: center;
	padding: 24px 0;
	margin: 0;
	border-bottom: 1px solid #f0f2f7;
	}
	/* 表单项容器 */
	.edit-form-div {
	display: flex;
	flex-wrap: wrap;
	padding: 18px 30px;
	border-bottom: 1px solid #f0f2f7;
	transition: background 0.3s;
	}
	.edit-form-div:hover {
	background: #f8fafc;
	}
	/* 表单标签 */
	.edit-form-name {
	width: 160px;
	font-weight: 600;
	color: #5a5e66;
	padding: 10px 0;
	font-size: 14px;
	}
	/* 输入控件容器 */
	.edit-form-div2 {
	flex: 1;
	min-width: 300px;
	}
	.edit-form-div3 {
	max-width: 600px;
	}
	/* Element输入框增强 */
	.el-input__inner,
	.el-textarea__inner {
	border-radius: 6px;
	transition: all 0.3s cubic-bezier(0.4, 0, 0.2, 1);
	}
	.el-input__inner:focus,
	.el-textarea__inner:focus {
	border-color: #409EFF;
	box-shadow: 0 0 0 2px rgba(64, 158, 255, 0.2);
	}
	/* 下拉选择器 */
	.searchable-select {
	width: 100%;
	}
	/* 文件上传区域 */
	.dropzone {
	border: 2px dashed #e4e7ed !important;
	border-radius: 8px;
	background: #f8fafc;
	padding: 20px;
	transition: all 0.3s;
	}
	.dropzone:hover {
	border-color: #409EFF !important;
	background: #f5faff;
	}
	.dz-default.dz-message {
	color: #909399;
	font-size: 14px;
	margin: 0 !important;
	}
	.dz-default.dz-message::before {
	content: "📎";
	font-size: 24px;
	display: block;
	margin-bottom: 8px;
	}
	/* 富文本编辑器容器 */
	.editorDiv {
	border: 1px solid #e4e7ed;
	border-radius: 6px;
	overflow: hidden;
	}
	/* 省市区选择器 */
	.pcaDiv {
	gap: 10px;
	}
	.pcaDiv select {
	flex: 1;
	padding: 8px 12px;
	border-radius: 6px;
	border: 1px solid #e4e7ed;
	background: #fff;
	}
	/* 日期时间输入 */
	input[type="datetime-local"],
	input[type="date"] {
	width: 100%;
	padding: 8px 12px;
	border: 1px solid #e4e7ed;
	border-radius: 6px;
	transition: all 0.3s;
	}
	input[type="datetime-local"]:focus,
	input[type="date"]:focus {
	border-color: #409EFF;
	box-shadow: 0 0 0 2px rgba(64, 158, 255, 0.2);
	}
	/* 星级评分 */
	.evalStar {
	display: flex;
	gap: 6px;
	}
	.evalStar img {
	width: 28px;
	height: 28px;
	cursor: pointer;
	transition: transform 0.2s;
	}
	.evalStar img:hover {
	transform: scale(1.1);
	}
	/* 按钮容器 */
	.edit-page-div-btn {
	padding: 30px;
	text-align: center;
	}
	.el-button {
	min-width: 120px;
	border-radius: 6px;
	transition: all 0.3s;
	}
	.el-button--primary {
	background: linear-gradient(135deg, #409EFF 0%, #3375b9 100%);
	border: none;
	}
	.el-button--default {
	border: 1px solid #e4e7ed;
	}
	/* 响应式设计 */
	@media (max-width: 768px) {
	.edit-page-div {
	padding: 15px;
	}
	.edit-form-div {
	padding: 12px;
	flex-direction: column;
	}
	.edit-form-name {
	width: 100%;
	margin-bottom: 8px;
	}
	.edit-form-div2 {
	min-width: 100%;
	}
	.pcaDiv {
	flex-direction: column;
	}
	}
	@media (max-width: 480px) {
	.box-card {
	border-radius: 8px;
	}
	.edit-page-div-h2 {
	font-size: 20px;
	padding: 16px 0;
	}
	.el-button {
	width: 100%;
	margin: 8px 0 !important;
	}
	}
</style>



