

<template>
	<div class="admin-modal admin-inmodal admin-in" id="bodyModal" tabindex="-1" role="dialog" aria-hidden="false" style="top: 80px; left: -200px; ">
		<div class="admin-modal-dialog">
			<div class="admin-modal-content">
				<div class="admin-modal-header">
					<button type="button" class="admin-close" @click="handleExportJsMethod"  data-methodtype="hideModal"><span aria-hidden="true">×</span><span class="admin-sr-only">关闭</span>
					</button>
					<h4 class="admin-modal-title" id="bodyModalTile"></h4>
				</div>
				<div class="admin-modal-body" id="bodyModalContent" style="padding:30px;"></div>
				<div class="admin-modal-footer">
					<button type="button" class="admin-btn admin-btn-white" @click="handleExportJsMethod"  data-methodtype="hideModal">关闭</button>
				</div>
			</div>
		</div>
	</div>
	<el-card class="box-card"  style="margin-left:2%;width:95%;margin-top:20px;">
		<template #header>
			<div class="card-header">
				<span>异常预警</span>
			</div>
		</template>
		<div>
			<el-form :inline="true" :model="formInline" class="demo-form-inline">
				<el-form-item label="异常类型" style="min-width:250px;">
					<el-select  class="" data-id="ycType"  v-model="ycType"  id="ycType" >
						<template v-for="item in ycTypeList">
							<el-option  :value="item.id"   :label="item.name"></el-option>
						</template>
					</el-select>
				</el-form-item>
				<el-form-item label="处理状态" style="min-width:250px;">
					<el-select  class="" data-id="dealStatus"  v-model="dealStatus"  id="dealStatus" >
						<template v-for="item in dealStatusList">
							<el-option  :value="item.id"   :label="item.name"></el-option>
						</template>
					</el-select>
				</el-form-item>
				<el-form-item>
					<el-button type="primary" @click="ajaxList(1)" >查询</el-button>
				</el-form-item>
			</el-form>
			<div style="margin-top:5px;padding-left: 15px;">
			</div>
			<div style="margin-top:5px;margin-bottom:5px;padding-left: 15px;">
			</div>
			<div >
				<el-table
					ref="multipleTable"
					border
					:data="dataList"
					tooltip-effect="dark"
					style="width: 100%"
					:row-style="{backgroundColor: 'rgba(255,255,255,0.9)'}"
					:header-row-style="{backgroundColor: '#f8f8f8'}"
					>
					<el-table-column
						label="异常说明">
						<template v-slot="{ row }">
							<div v-html="''+(row.ycWarning.ycIntro==null?'':row.ycWarning.ycIntro)+''"></div>
						</template>
					</el-table-column>
					<el-table-column
						label="异常类型">
						<template v-slot="{ row }">
							<div v-html="''+(row.ycTypeStr==null?'':row.ycTypeStr)+''"></div>
						</template>
					</el-table-column>
					<el-table-column label="异常附图"  width="200px">
						<template v-slot="{ row }">
							<template v-for="item4 in row.ycImgList">
								<img :src="item4"  style="width:80px;height:80px;display:inline;margin-left:4px;" @click="handleExportJsMethod"  data-methodtype="maxImg">
								</template>
							</template>
						</el-table-column>
						<el-table-column
							label="责任人">
							<template v-slot="{ row }">
								<div v-html="''+(row.ycWarning.zrr==null?'':row.ycWarning.zrr)+''"></div>
							</template>
						</el-table-column>
						<el-table-column
							label="责任人电话">
							<template v-slot="{ row }">
								<div v-html="''+(row.ycWarning.zrrCel==null?'':row.ycWarning.zrrCel)+''"></div>
							</template>
						</el-table-column>
						<el-table-column
							label="所属单位">
							<template v-slot="{ row }">
								<div v-html="''+(row.ycWarning.dw==null?'':row.ycWarning.dw)+''"></div>
							</template>
						</el-table-column>
						<el-table-column
							label="所属部门">
							<template v-slot="{ row }">
								<div v-html="''+(row.ycWarning.depart==null?'':row.ycWarning.depart)+''"></div>
							</template>
						</el-table-column>
						<el-table-column
							label="异常发现时间">
							<template v-slot="{ row }">
								<div v-html="''+(row.ycWarning.ycfxTime==null?'':row.ycWarning.ycfxTime)+''"></div>
							</template>
						</el-table-column>
						<el-table-column
							label="处理状态">
							<template v-slot="{ row }">
								<div v-html="''+(row.dealStatusStr==null?'':row.dealStatusStr)+''"></div>
							</template>
						</el-table-column>
						<el-table-column
							label="处理说明">
							<template v-slot="{ row }">
								<div v-html="''+(row.ycWarning.dealIntro==null?'':row.ycWarning.dealIntro)+''"></div>
							</template>
						</el-table-column>
						<el-table-column label="处理文件"  width="200px">
							<template v-slot="{ row }">
								<template v-for="item2 in row.dealFileList">
									<a :href="item2.url" target="_blank" style="width:150px;display:inline;margin-left:4px;">{{item2.name}}</a>
								</template>
							</template>
						</el-table-column>
						<el-table-column
							label="处理时间">
							<template v-slot="{ row }">
								<div v-html="''+(row.ycWarning.dealTime==null?'':row.ycWarning.dealTime)+''"></div>
							</template>
						</el-table-column>
						<el-table-column
							label="纪委书记">
							<template v-slot="{ row }">
								<div v-html="''+(row.jwBookStr==null?'':row.jwBookStr)+''"></div>
							</template>
						</el-table-column>
						<el-table-column
							fixed="right"
							label="操作"
							width="240">
							<template v-slot="{ row }">
								<el-button
									href="javascript:void(0)" :data-id="row.ycWarning.id" @click="del"
									type="danger" style="margin-left:5px;margin-top:5px;"
									>
									删除
								</el-button>
								<el-button
									href="javascript:void(0)" :data-params="'id='+row.ycWarning.id+''" data-href="/admin/yc_warning/update_page" @click="goToPage"
									type="warning" style="margin-left:5px;margin-top:5px;"
									>
									修改
								</el-button>
							</template>
						</el-table-column>
					</el-table>
					<div>
						<div id="yc_warning_bar" class="pagination" style="margin-top:20px;"></div>
					</div>
				</div>
			</div>
		</el-card>
	</template>
	
<script>
import $ from 'jquery'
import {utils} from '../../../assets/listutils.js'
import {admin_utils} from '../../../assets/admin/admin_utils.js'
import {myPagination} from '../../../assets/page/myPagination.js'
export default {
	components: {
	},
	data() {
		return {
			currentLoginToken:'',
			currentLoginId:'',
			currentLoginType:'',
			ycType:'',
			dealStatus:'',
			dataList:[],
			ycTypeList:[],
			dealStatusList:[],
		};
	},
	mounted() {
		var that = this;
		that.currentLoginToken=utils.getCookie('loginToken');
		that.currentLoginId=utils.getCookie('loginId');
		that.currentLoginType=utils.getCookie('loginType');
		that.getInitData();
		that.ajaxList(1);
	},
	methods:{
		getInitData(){
			var that = this;
			$.ajax({
				type : 'get',
				url : this.REQUEST_URL+"/admin/yc_warning/getInitData",
				async: false,
				data : {
					"loginToken":that.currentLoginToken,
				},
				success : function(result) {
					that.ycTypeList = admin_utils.addAllSelect(result.ycTypeList);
					that.dealStatusList = admin_utils.addAllSelect(result.dealStatusList);
				}
			});
		},
		del(e){
			var that = this;
			var dataId  =e.currentTarget.dataset.id;
			var r=confirm("确认删除该数据吗？");
			if(r==true){
				$.ajax({
					type : 'get',
					url : this.REQUEST_URL+"/admin/yc_warning/del",
					async: false,
					data : {
						"loginToken":that.currentLoginToken,
						"id":dataId
					},
					success : function(result) {
						alert(result.msg);
						if(result.code==1){
							that.ajaxList(1);
						}
					}
				});
			}
		},
		ajaxCount(){
			var that = this;
			var rs = null;
			var ycType = that.ycType;
			var dealStatus = that.dealStatus;
			$.ajax({
				type : 'get',
				url : this.REQUEST_URL+'/admin/yc_warning/queryCount',
				async: false,
				data : {
					"loginToken":that.currentLoginToken,
					"ycType":ycType,
					"dealStatus":dealStatus,
				},
				success : function(result) {
					rs = result;
				}
			});
			return rs;
		},
		ajaxList(page){
			var that = this;
			if(page==undefined||page==null){
				page=1;
			}
			var ycType = that.ycType;
			var dealStatus = that.dealStatus;
			var countRs = that.ajaxCount();
			if(countRs.totalPage<page){
				page = countRs.totalPage;
			}
			$.ajax({
				type : 'get',
				url : this.REQUEST_URL+'/admin/yc_warning/queryList',
				async: false,
				data : {
					"page":page,
					"loginToken":that.currentLoginToken,
					"ycType":ycType,
					"dealStatus":dealStatus,
				},
				success : function(result) {
					admin_utils.hideLoading();
					var rows = result.list;
					var total = countRs.count;//得到数据总数
					var totalPage=countRs.totalPage;
					that.dataList=rows;
					new myPagination({
						id: 'yc_warning_bar',
						curPage:page, //初始页码
						pageTotal:totalPage, //总页数
						pageAmount: 10,  //每页多少条
						dataTotal: total, //总共多少条数据
						pageSize: 10, //可选,分页个数
						showPageTotalFlag:true, //是否显示数据统计
						showSkipInputFlag:false, //是否支持跳转
						getPage: function (page) {
							that.ajaxList(page)
						}
					})
				}
			});
		},
		handleExportJsMethod(e){
			var div = e.currentTarget;
			var methodtype = div.dataset.methodtype;
			if(methodtype=='maxImg'){
				admin_utils.maxImg(div);
			}
			if(methodtype=='hideModal'){
				admin_utils.hideModal(div);
			}
		},
	}
};

</script>
	<style type="text/css" src="../../../assets/page/myPagination.css?t=44" scoped></style>
	<style type="text/css" src="../../../assets/admin/style.css?t=44" scoped></style>
	<style scoped>
		/* 全局滚动条美化 */
		::-webkit-scrollbar {
		width: 8px;
		height: 8px;
		background-color: #f5f5f5;
		}
		::-webkit-scrollbar-thumb {
		border-radius: 4px;
		background: linear-gradient(135deg, #409EFF 0%, #3375b9 100%);
		}
		/* 卡片容器样式 */
		.el-card {
		border-radius: 8px;
		box-shadow: 0 2px 12px 0 rgba(0,0,0,0.08);
		}
		.card-header {
		padding: 18px 20px;
		background: linear-gradient(135deg, #f8f9fa 0%, #e9ecef 100%);
		border-bottom: 1px solid #dee2e6;
		}
		.card-header span {
		font-size: 1.2rem;
		color: #2c3e50;
		font-weight: 600;
		}
		/* 表单增强样式 */
		.el-form--inline .el-form-item {
		margin-right: 28px;
		margin-bottom: 18px;
		}
		.el-form-item__label {
		font-weight: 500;
		color: #5a5e66;
		}
		.el-input__inner {
		border-radius: 4px;
		transition: border-color 0.3s cubic-bezier(0.645, 0.045, 0.355, 1);
		}
		.el-input__inner:focus {
		border-color: #409EFF;
		box-shadow: 0 0 4px rgba(64, 158, 255, 0.2);
		}
		/* 表格视觉优化 */
		.el-table {
		--el-table-header-bg-color: linear-gradient(135deg, #f8f9fa 0%, #e9ecef 100%);
		--el-table-row-hover-bg-color: #f5f7fa;
		}
		.el-table__header th {
		font-weight: 600;
		color: #303133;
		}
		.el-table__body td {
		padding: 12px 0;
		}
		/* 图片预览样式 */
		.el-table img {
		border: 2px solid #ebeef5;
		transition: transform 0.2s;
		cursor: zoom-in;
		}
		.el-table img:hover {
		transform: scale(1.05);
		box-shadow: 0 2px 8px rgba(0,0,0,0.12);
		}
		/* 分页组件美化 */
		.pagination {
		--active-bg: #409EFF;
		--hover-bg: #ecf5ff;
		}
		.pagination a,
		.pagination span {
		border-radius: 4px;
		transition: all 0.3s;
		}
		.pagination .current {
		background: var(--active-bg);
		border-color: var(--active-bg);
		}
		.pagination a:hover {
		background: var(--hover-bg);
		color: var(--active-bg);
		}
		/* 模态框视觉优化 */
		.admin-modal-content {
		border-radius: 8px;
		overflow: hidden;
		}
		.admin-modal-header {
		padding: 16px 20px;
		background: #f8f9fa;
		border-bottom: 1px solid #dee2e6;
		}
		.admin-modal-title {
		font-size: 1.1rem;
		color: #2c3e50;
		}
		.admin-modal-footer {
		padding: 16px 20px;
		background: #f8f9fa;
		border-top: 1px solid #dee2e6;
		}
		select{
		height:30px;
		}
		/* 固定列容器不透明处理 */
		::v-deep .el-table__fixed-right {
		background: #FFFFFF !important;
		box-shadow: -5px 0 15px -5px rgba(0,0,0,0.1);
		}
		/* 单元格背景色覆盖 */
		::v-deep .el-table__fixed-body-wrapper .el-table__body td {
		background: #FFFFFF !important;
		}
		/* 去除底部边框干扰 */
		::v-deep .el-table__fixed-right::before {
		background-color: transparent !important;
		}
		::v-deep .el-table__fixed-right {
		box-shadow: -5px 0 15px -5px rgba(0,0,0,0.08);
		background: #ffffff !important; /* 白色不透明背景 */
		}
		::v-deep .el-table__fixed-right .el-table__body td {
		background: #ffffff !important; /* 单元格不透明背景 */
		transition: all 0.3s; /* 保留原有过渡效果 */
		}
		::v-deep .el-table__fixed-right th.el-table__cell {
		background: linear-gradient(135deg, #f8faff 0%, #e6f0ff 100%) !important; /* 保留表头渐变效果 */
		}
	</style>



