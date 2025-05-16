<template>
	<div class="login-body-class">
		<div id="main"  class="login-main-warp" >
			<div class="login-main-content">
				<div>
					<div style="height:60px;padding:10px;min-width:240px;max-width:50%;background-color:#5cb85c;border-bottom-right-radius: 40px;display: flex;  align-items: center;justify-content: center;text-align:center">
						<h4 style="color:white">国企“智廉招采”风险监管系统</h4>
					</div>
				</div>
				<div class="login-formDiv"   style="padding:30px;border-radius: 5px;">
					<h3  style="color:#5cb85c;text-align:center">登录</h3>
					<div>
						<div >
							<p style="margin-top:7px">登录名/工号</p>
							<div>
								<input type="text"  placeholder="请输入登录名/工号" name="name" v-model="name" class="login-inputs"  id="name">
							</div>
							<p style="margin-top:7px">密码</p>
							<div>
								<input type="password"  placeholder="请输入密码" name="password" v-model="password" class="login-inputs"  id="password">
							</div>
							<p style="margin-top:20px">图片验证码</p>
							<div  class="login-input-warp">
								<input  id="imgCode" name="imgCode" type="text" placeholder="验证码" v-model="imgCode" style="width:150px;height:25px;border:0px;">
								<img id="codeImg1"  name="codeImg" @click="changeCode" :src="codeImg1" alt="点击更换" title="点击更换"  style="height:30px;width:90px;float:right">
								</div>
								<div class="gap">
									<div class="pretty-box">
										<input name="loginType" type="radio" value="1" v-model="loginType" id="loginType1" style="margin-left:10px;"/>
										<label for="loginType1" style="color:#5cb85c">管理员</label>
										<input name="loginType" type="radio" value="2" v-model="loginType" id="loginType2" style="margin-left:10px;"/>
										<label for="loginType2" style="color:#5cb85c">国资委</label>
										<input name="loginType" type="radio" value="3" v-model="loginType" id="loginType3" style="margin-left:10px;"/>
										<label for="loginType3" style="color:#5cb85c">纪委书记</label>
										<input name="loginType" type="radio" value="4" v-model="loginType" id="loginType4" style="margin-left:10px;"/>
										<label for="loginType4" style="color:#5cb85c">员工</label>
									</div>
								</div>
								<div>
									<div    style="margin-top: 10px;height:30px;font-size:14px;">
									</div>
								</div>
								<div style="margin-top: 10px;">
									<div>
										<input type="hidden" value="jsform" id="_app"/>
										<button type="button" @click="submitForm" id="submitBtn" class="btn-block loginBlue">登录</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</template>
	
<script>
import $ from 'jquery'
import {utils} from '../assets/listutils.js'
export default {
	components: {
	},
	data() {
		return {
			name:'',
			password:'',
			imgCode:'',
			codeImg1:'',
			codeToken:'',
			loginType:'',
		};
	},
	mounted() {
		this.changeCode();
	},
	methods:{
		changeCode(){
			var that = this;
			$.ajax({
				type: 'post',
				url: this.REQUEST_URL+"/"+'/validCode/code',
				data: {
				},
				success: function(result) {
					that.codeToken = result.codeToken;
					that.codeImg1 = result.imgUrl;
				}
			});
		},
		submitForm(){
			var that = this;
			$.ajax({
				type: 'post',
				url: this.REQUEST_URL+'/login/sysSubmit',
				data: {
					'imgCode':that.imgCode,
					'imgCodeToken':that.codeToken,
					'name':that.name,
					'password':that.password,
					'loginType':that.loginType
				},
				success: function(result) {
					if(result.code==1){
						utils.setCookie('loginId',result.loginId,1);
						utils.setCookie('loginType',result.loginType,1);
						utils.setCookie('loginName',result.loginName,1);
						utils.setCookie('loginToken',result.loginToken,1);
						var lt = that.loginType;
						if(lt=='1'){
							that.goToPageJS('/admin/index','');
						}
						if(lt=='2'){
							that.goToPageJS('/gzw/index','');
						}
						if(lt=='3'){
							that.goToPageJS('/jwsj/index','');
						}
						if(lt=='4'){
							that.goToPageJS('/staff/index','');
						}
						}else{
						alert(result.msg);
					}
				}
			});
		},
	}
};

</script>
	<style type="text/css" src="../assets/login/login.css?t=44" scoped></style>
	<style scoped>
		* {
		-webkit-box-sizing: border-box;
		-moz-box-sizing: border-box;
		box-sizing: border-box;
		}
		p{
		font-size:14px;
		}
		span{
		font-size:14px;
		}
		.btn-block {
		display: block;
		width: 100%;
		padding:10px;
		}
		.login-body-class{
		min-height:950px;
		background-image:url(../assets/login_bg.jpg);
		background-size:100% 100%;
		padding:80px;
		}
		input::-ms-clear {
		display: none
		}
		input::-ms-reveal {
		display: none
		}
		.dotted-line {
		position: relative;
		text-align: center;
		padding: 10px 0;
		color: #5cb85c;
		}
		.dotted-line::before,
		.dotted-line::after {
		content: '';
		position: absolute;
		top: 50%;
		width: 25%;
		height: 1px;
		background: #5cb85c;
		background-image: linear-gradient(to right, #5cb85c 50%, rgba(255, 255, 255, 0) 50%);
		}
		.dotted-line::before {
		transform: translateX(-100%);
		}
		.dotted-line::after {
		transform: translateX(0%);
		}
	</style>



