<template>
	<div class="bodyClass">
		<el-card class="box-card" >
			<template #header>
				<div class="card-header">
					<span>首页</span>
				</div>
			</template>
			<div  class="home-div1">
				<div  class="home-div2">
					<div  class="home-div3">
						<div  class="home-div4">
							<div  class="home-div5">
								<div  class="home-div6">
									<div  class="home-div7">
										<h1  class="home-div8">{{data.data1}}</h1>
										<p  class="home-div9"> 待审核采购</p>
									</div>
									<div  class="home-div7">
										<h1  class="home-div8">{{data.data2}}</h1>
										<p  class="home-div9"> 采购中数</p>
									</div>
									<div  class="home-div7">
										<h1  class="home-div8">{{data.data3}}</h1>
										<p  class="home-div9"> 已完成的采购</p>
									</div>
									<hr style="margin-top:20px">
									</div>
									<div class="home-list-div1">
										<div  class="home-list-div5">
											<div  class="home-list-div6">
												<div  class="home-list-div7">
													<h3  class="home-list-div8">采购统计</h3>
												</div>
												<div id="dataDiv4" style="width:96%;margin-left:2%;min-height:300px;"></div>
											</div>
										</div>
										<template v-for="item in data.data4">
											<div style="display:none" class="dataDiv4" :data-title="item.title" :data-cg-num="item.value" >
											</div>
										</template>
										<div  class="home-list-div5">
											<div  class="home-list-div6">
												<div  class="home-list-div7">
													<h3  class="home-list-div8">异常统计</h3>
												</div>
												<div id="dataDiv5" style="width:96%;margin-left:2%;min-height:300px;"></div>
											</div>
										</div>
										<template v-for="item in data.data5">
											<div style="display:none" class="dataDiv5" :data-title="item.title" :data-id="item.value" >
											</div>
										</template>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</el-card>
		</div>
	</template>
	
<script>
import $ from 'jquery'
import {utils} from '../assets/listutils.js'
import {admin_utils} from '../assets/admin/admin_utils.js'
import echarts from '../assets/echarts/echarts.min.js'
export default {
	components: {
	},
	data() {
		return {
			currentLoginToken:'',
			currentLoginId:'',
			currentLoginType:'',
			data:{},
		};
	},
	mounted() {
		this.currentLoginToken=utils.getCookie('loginToken');
		this.currentLoginId=utils.getCookie('loginId');
		this.currentLoginType=utils.getCookie('loginType');
		this.initData();
		this.$nextTick(() => {
			this.initEcharts();
		})
	},
	methods:{
		initData(){
			var that = this;
			$.ajax({
				type : 'get',
				url : this.REQUEST_URL+"/home/getHomeMsg",
				async: false,
				data : {
					'loginToken':that.currentLoginToken,
				},
				success : function(result) {
					that.data = result;
				}
			});
		},
		initEcharts(){
			var that = this;
			var myChart4 = echarts.init(document.getElementById('dataDiv4'));
			var option4 = {
				title : {
					text: '',
					subtext: ''
				},
				tooltip : {
					trigger: 'axis'
				},
				legend: {
					data:[
					'采购数量'
					]
				},
				toolbox: {
					show : false,
					feature : {
						mark : {show: true},
						magicType : {
							show: true,
							type: ['line', 'bar'],
							title:['转为折线图','转为柱状图']
						},
						saveAsImage : {
							show: true,
							title :'保存为图片'
						}
					}
				},
				calculable : true,
				xAxis : [
				{
					type : 'category',
					boundaryGap : false
				}
				],
				yAxis : [
				{
					type : 'value',
					axisLabel : {
						formatter: '{value} '
					}
				}
				],
				series : [
				{
					name:'采购数量',
					type:'line',
					markPoint : {
						data : [
						{type : 'max', name: '最大值'},
						{type : 'min', name: '最小值'}
						]
					},
					markLine : {
						data : [
						{type : 'average', name: '平均值'}
						]
					}
				}
				]
			};
			var gatherDiv4 = $(".dataDiv4");
			var x4 = [];
			var ycgNum4 = [];
			for(var i=0;i<gatherDiv4.length;i++){
				var title = $(gatherDiv4[i]).attr("data-title");
				x4.push(title);
				var cgNum4 = $(gatherDiv4[i]).attr("data-cg-num");
				ycgNum4.push(cgNum4);
			}
			option4.xAxis[0].data=x4;
			option4.series[0].data=ycgNum4;
			myChart4.setOption(option4);
			window.addEventListener('resize', function () {
				myChart4.resize();
			});
			var myChart5 = echarts.init(document.getElementById('dataDiv5'));
			var option5 = {
				title : {
					text: '',
					subtext: '',
					x:'center'
				},
				tooltip : {
					trigger: 'item',
					formatter: "{a} <br/>{b} : {c} ({d}%)"
				},
				legend: {
					orient : 'vertical',
					x : 'left',
					data:['数量']
				},
				toolbox: {
					show : false,
					feature : {
						mark : {show: true},
						dataView : {show: true, readOnly: false},
						magicType : {
							show: true,
							type: ['pie', 'funnel'],
							option5: {
								funnel: {
									x: '25%',
									width: '50%',
									funnelAlign: 'left',
									max: 1548
								}
							}
						},
						restore : {show: true},
						saveAsImage : {show: true}
					}
				},
				calculable : true,
				series : [
				{
					name:'数量',
					type:'pie',
					radius : '55%',
					center: ['50%', '60%']
				}
				]
			};
			var gatherDiv5 = $(".dataDiv5");
			var x5 = [];
			var yid5 = [];
			for(var i=0;i<gatherDiv5.length;i++){
				var title = $(gatherDiv5[i]).attr("data-title");
				var amap ={};
				amap.name=title;
				var id5 = $(gatherDiv5[i]).attr("data-id");
				amap.value=id5;
				x5.push(amap);
			}
			option5.series[0].data=x5;
			myChart5.setOption(option5);
			window.addEventListener('resize', function () {
				myChart5.resize();
			});
		},
	}
};

</script>
	<style scoped>
		.bodyClass {
		background-color: #f5f7fa;
		min-height: 100vh;
		padding: 20px;
		}
		.box-card {
		max-width: 1600px;
		margin: 10px auto;
		border-radius: 12px;
		box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
		}
		.card-header {
		padding: 20px 0;
		border-bottom: 1px solid #ebeef5;
		}
		.card-header span {
		font-size: 24px;
		font-weight: 600;
		color: #303133;
		}
		.home-div2 {
		display: grid;
		gap: 20px;
		padding: 20px 0;
		}
		.home-div3 {
		display: grid;
		grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
		gap: 20px;
		}
		.home-div6{
		display:flex
		}
		.home-div7 {
		display: grid;
		grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
		gap: 20px;
		padding: 20px;
		background: #ccdbf8;
		text-align: center;
		border-radius: 8px;
		box-shadow: 0 2px 8px rgba(0, 0, 0, 0.05);
		margin-left:10px;
		}
		.home-div8 {
		color: #409eff;
		font-size: 32px;
		margin-bottom: 8px;
		font-weight: 700;
		}
		.home-div9 {
		color: #909399;
		font-size: 14px;
		margin: 0;
		}
		.home-list-div1 {
		display: grid;
		grid-template-columns: repeat(auto-fit, minmax(380px, 1fr));
		gap: 24px;
		margin-top: 30px;
		}
		.home-list-div5 {
		background: #fff;
		border-radius: 8px;
		padding: 15px;
		box-shadow: 0 2px 8px rgba(0, 0, 0, 0.05);
		}
		.home-list-div7 {
		border-bottom: 1px solid #ebeef5;
		padding-bottom: 12px;
		margin-bottom: 15px;
		}
		.home-list-div8 {
		color: #303133;
		margin: 0;
		font-size: 18px;
		}
		#dataDiv5,
		#dataDiv6,
		#dataDiv7 {
		height: 300px;
		}
		hr {
		border: 0;
		height: 1px;
		background: #ebeef5;
		margin: 25px 0;
		}
		@media (max-width: 768px) {
		.home-div3 {
		grid-template-columns: 1fr;
		}
		.home-list-div1 {
		grid-template-columns: 1fr;
		}
		.home-div8 {
		font-size: 28px;
		}
		.card-header span {
		font-size: 20px;
		}
		}
		@media (max-width: 480px) {
		.bodyClass {
		padding: 10px;
		}
		.home-div7 {
		padding: 15px;
		}
		.home-div8 {
		font-size: 24px;
		}
		}
		/* 课程订阅排行样式 */
		.home-list-div1-h1 {
		font-size: 24px;
		color: #303133;
		text-align: center;
		margin: 20px 0;
		font-weight: 600;
		letter-spacing: 1px;
		}
		.admin-table {
		width: 100%;
		border-collapse: collapse;
		margin: 20px 0;
		box-shadow: 0 1px 4px rgba(0, 0, 0, 0.08);
		border-radius: 8px;
		overflow: hidden;
		}
		.admin-table thead {
		background: #f8f9fa;
		}
		.admin-table th {
		padding: 16px 12px;
		text-align: center;
		color: #606266;
		font-weight: 600;
		border-bottom: 2px solid #ebeef5;
		}
		.admin-table td {
		padding: 14px 12px;
		text-align: center;
		color: #606266;
		border-bottom: 1px solid #f0f2f5;
		transition: background 0.2s ease;
		}
		.admin-table tr:hover td {
		background: #f5f7fa;
		}
		.admin-table img {
		width: 50px;
		height: 50px;
		border-radius: 4px;
		object-fit: cover;
		box-shadow: 0 2px 4px rgba(0, 0, 0, 0.08);
		transition: transform 0.2s ease;
		}
		.admin-table img:hover {
		transform: scale(1.1);
		}
		/* 无数据提示样式 */
		.admin-table + div[style*="height:40px"] h2 {
		color: #909399;
		font-size: 16px;
		font-weight: normal;
		padding: 20px 0;
		border: none !important;
		}
		/* 响应式优化 */
		@media (max-width: 768px) {
		.admin-table thead {
		display: none;
		}
		.admin-table tr {
		display: block;
		margin-bottom: 16px;
		box-shadow: 0 1px 4px rgba(0, 0, 0, 0.08);
		border-radius: 8px;
		}
		.admin-table td {
		display: flex;
		justify-content: space-between;
		align-items: center;
		padding: 12px;
		text-align: right;
		border-bottom: none;
		}
		.admin-table td::before {
		content: attr(data-label);
		font-weight: 500;
		color: #909399;
		margin-right: auto;
		padding-right: 20px;
		}
		.admin-table img {
		width: 40px;
		height: 40px;
		}
		}
		/* 斑马纹效果 */
		.admin-table tr:nth-child(even) {
		background-color: #fafafa;
		}
		/* 表头悬浮效果 */
		.admin-table thead:hover {
		background: #f5f7fa;
		}
	</style>



