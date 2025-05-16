

<template>
	<div class="edit-page-div">
		<div class="box-card">
			<h2 class="edit-page-div-h2">异常预警-修改</h2>
			<div class="edit-form-div" id="ycIntroForm">
				<div  class="edit-form-name">异常说明</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入异常说明" name="ycIntro" v-model="ycIntro" class="" id="ycIntro"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="ycImgForm">
				<div  class="edit-form-name">异常附图</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<div id="ycImg" class="dropzone" data-id="ycImg" max-num="1" file-type="1" max-size="1000" init-val="" :request-url="REQUEST_URL" :init-val="ycImg"></div>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="zrrForm">
				<div  class="edit-form-name">责任人</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入责任人" name="zrr" v-model="zrr" class="" id="zrr"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="zrrCelForm">
				<div  class="edit-form-name">责任人电话</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入责任人电话" name="zrrCel" v-model="zrrCel" class="" id="zrrCel"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="dwForm">
				<div  class="edit-form-name">所属单位</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入所属单位" name="dw" v-model="dw" class="" id="dw"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="departForm">
				<div  class="edit-form-name">所属部门</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入所属部门" name="depart" v-model="depart" class="" id="depart"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="ycfxTimeForm">
				<div  class="edit-form-name">异常发现时间</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<input type="datetime-local" id="ycfxTime"  class="el-input__inner"  style="padding:4px;border:1px solid #409eff;border-radius: var(--el-input-border-radius,var(--el-border-radius-base)); ">
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="dealIntroForm">
				<div  class="edit-form-name">处理说明</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<el-input type="text"  placeholder="请输入处理说明" name="dealIntro" v-model="dealIntro" class="" id="dealIntro"></el-input>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="dealFileForm">
				<div  class="edit-form-name">处理文件</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<div id="dealFile" class="dropzone" data-id="dealFile" max-num="1" file-type="4" max-size="1000" init-val="" :request-url="REQUEST_URL" :init-val="dealFile"></div>
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="dealTimeForm">
				<div  class="edit-form-name">处理时间</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<input type="datetime-local" id="dealTime"  class="el-input__inner"  style="padding:4px;border:1px solid #409eff;border-radius: var(--el-input-border-radius,var(--el-border-radius-base)); ">
					</div>
				</div>
			</div>
			<div class="edit-form-div" id="jwBookForm">
				<div  class="edit-form-name">纪委书记</div>
				<div class="edit-form-div2">
					<div class="edit-form-div3">
						<select  class="" data-id="jwBook"    id="jwBook" >
							<template v-for="item in jwBookList">
								<option :value="item.id">{{item.name}}</option>
							</template>
						</select>
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
			id:'',
			ycIntro:'',
			ycImg:'',
			zrr:'',
			zrrCel:'',
			dw:'',
			depart:'',
			ycfxTime:'',
			dealIntro:'',
			dealFile:'',
			dealTime:'',
			jwBook:'',
			jwBookList:[],
		};
	},
	mounted() {
		var that = this;
		that.currentLoginToken=utils.getCookie('loginToken');
		that.id= that.$route.query.id;
		that.getDataList();
		var ycImgDrop = initDropZone('ycImg');
		var dealFileDrop = initDropZone('dealFile');
		$('#jwBook').next().remove();
		$('#jwBook').searchableSelect(that.jwBookList);
		that.queryDataDetail();
		setZoneImg(ycImgDrop,that.ycImg);
		date_utils.setDomVal("ycfxTime",that.ycfxTime);
		setZoneImg(dealFileDrop,that.dealFile);
		date_utils.setDomVal("dealTime",that.dealTime);
		setSelectableVal('jwBook',that.jwBook)
	},
	methods:{
		getDataList(){
			var that = this;
			$.ajax({
				type : 'get',
				url : this.REQUEST_URL+"/admin/yc_warning/getInitData",
				async: false,
				data : {
					'loginToken':that.currentLoginToken
				},
				success : function(result) {
					that.jwBookList = result.jwBookList;
				}
			});
		},
		queryDataDetail(){
			var that = this;
			$.ajax({
				type : 'get',
				url : this.REQUEST_URL+"/admin/yc_warning/queryDataDetail",
				async: false,
				data : {
					'id':that.id,
					'loginToken':that.currentLoginToken,
				},
				success : function(result) {
					that.ycIntro=result.ycIntro;
					that.ycImg=result.ycImg;
					that.zrr=result.zrr;
					that.zrrCel=result.zrrCel;
					that.dw=result.dw;
					that.depart=result.depart;
					that.ycfxTime=result.ycfxTime;
					that.dealIntro=result.dealIntro;
					that.dealFile=result.dealFile;
					that.dealTime=result.dealTime;
					that.jwBook=result.jwBook;
				}
			});
		},
		submitData(){
			var that = this;
			var ycIntro = that.ycIntro;
			var ycImg = getFileVal2('ycImg');
			var zrr = that.zrr;
			var zrrCel = that.zrrCel;
			var dw = that.dw;
			var depart = that.depart;
			var ycfxTime = date_utils.getDomVal("ycfxTime");
			var dealIntro = that.dealIntro;
			var dealFile = getFileVal2('dealFile');
			var dealTime = date_utils.getDomVal("dealTime");
			var jwBook = getSelectableVal('jwBook');
			$.ajax({
				type : 'post',
				url : this.REQUEST_URL+"/admin/yc_warning/update_submit",
				async: false,
				data : {
					'id':that.id,
					'ycIntro':ycIntro,
					'ycImg':ycImg,
					'zrr':zrr,
					'zrrCel':zrrCel,
					'dw':dw,
					'depart':depart,
					'ycfxTime':ycfxTime,
					'dealIntro':dealIntro,
					'dealFile':dealFile,
					'dealTime':dealTime,
					'jwBook':jwBook,
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



