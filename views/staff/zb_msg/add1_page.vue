

<template>
	<div class="edit-page-div">
		<div class="box-card">
			<h2 class="edit-page-div-h2">中标信息-新增</h2>
			<div class="edit-form-div" id="zbsForm">
				<div  class="edit-form-name">中标商</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入中标商" name="zbs" v-model="zbs" class="" id="zbs"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="lxrForm">
				<div  class="edit-form-name">联系人</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入联系人" name="lxr" v-model="lxr" class="" id="lxr"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="lxfsForm">
				<div  class="edit-form-name">联系方式</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入联系方式" name="lxfs" v-model="lxfs" class="" id="lxfs"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="zbFileForm">
				<div  class="edit-form-name">中标文件</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<div id="zbFile" class="dropzone" data-id="zbFile" max-num="1" file-type="4" max-size="1000" init-val="" :request-url="REQUEST_URL" :init-val="zbFile"></div>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="pbzjForm">
				<div  class="edit-form-name">评标专家</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<select  class="" data-id="pbzj"    id="pbzj" >
							<template v-for="item in pbzjList">
								<option :value="item.id">{{item.name}}</option>
							</template>
						</select>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="zbTimeForm">
				<div  class="edit-form-name">中标时间</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<input type="datetime-local" id="zbTime"  class="el-input__inner"  style="padding:4px;border:1px solid #409eff;border-radius: var(--el-input-border-radius,var(--el-border-radius-base)); ">
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
import {getFileVal2,initDropZone,setZoneImg} from '../../../assets/imgupload/js/imgupload.js'
import {getSelectableVal,setSelectableVal} from '../../../assets/selectsearch/jquery.searchableSelect.js'
import {date_utils} from '../../../assets/datepicker/date_utils.js'
export default {
	components: {
	},
	data() {
		return {
			currentLoginToken:'',
			cgid:'',
			zbs:'',
			lxr:'',
			lxfs:'',
			zbFile:'',
			pbzj:'',
			zbTime:'',
			pbzjList:[],
		};
	},
	mounted() {
		var that = this;
		that.currentLoginToken=utils.getCookie('loginToken');
		that.cgid = that.$route.query.cgid;
		that.getDataList();
		var zbFileDrop = initDropZone('zbFile');
		$('#pbzj').next().remove();
		$('#pbzj').searchableSelect(that.pbzjList);
	},
	methods:{
		getDataList(){
			var that = this;
			$.ajax({
				type : 'get',
				url : this.REQUEST_URL+"/staff/zb_msg/getInitData",
				async: false,
				data : {
					'loginToken':that.currentLoginToken
				},
				success : function(result) {
					that.pbzjList = result.pbzjList;
				}
			});
		},
		submitData(){
			var that = this;
			var zbs = that.zbs;
			var lxr = that.lxr;
			var lxfs = that.lxfs;
			var zbFile = getFileVal2('zbFile');
			var pbzj = getSelectableVal('pbzj');
			var zbTime = date_utils.getDomVal("zbTime");
			$.ajax({
				type : 'post',
				url : this.REQUEST_URL+"/staff/zb_msg/add1_submit",
				async: false,
				data : {
					'cgid':that.cgid,
					'zbs':zbs,
					'lxr':lxr,
					'lxfs':lxfs,
					'zbFile':zbFile,
					'pbzj':pbzj,
					'zbTime':zbTime,
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
<style type="text/css" src="../../../assets/imgupload/css/dropzone.min.css?t=44" scoped></style>
<style type="text/css" src="../../../assets/selectsearch/jquery.searchableSelect.css?t=44" scoped></style>
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



