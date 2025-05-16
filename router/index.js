import { createRouter, createWebHistory } from 'vue-router'
	import sys_login from '../views/sys_login.vue';
	import home from '../views/home.vue';
	import admin_index from '../views/admin/index.vue';
	import gzw_index from '../views/gzw/index.vue';
	import jwsj_index from '../views/jwsj/index.vue';
	import staff_index from '../views/staff/index.vue';
	import admin_gzw_list from '../views/admin/gzw/list.vue';
	import admin_jw_book_list from '../views/admin/jw_book/list.vue';
	import admin_staff_list from '../views/admin/staff/list.vue';
	import admin_pbzj_list from '../views/admin/pbzj/list.vue';
	import staff_pbzj_list from '../views/staff/pbzj/list.vue';
	import admin_cg_msg_list from '../views/admin/cg_msg/list.vue';
	import staff_cg_msg_list from '../views/staff/cg_msg/list.vue';
	import admin_zb_msg_list from '../views/admin/zb_msg/list.vue';
	import staff_zb_msg_list from '../views/staff/zb_msg/list.vue';
	import admin_yc_warning_list from '../views/admin/yc_warning/list.vue';
	import gzw_yc_warning_list from '../views/gzw/yc_warning/list.vue';
	import jwsj_yc_warning_list from '../views/jwsj/yc_warning/list.vue';
	import admin_gys_msg_list from '../views/admin/gys_msg/list.vue';
	import staff_gys_msg_list from '../views/staff/gys_msg/list.vue';
	import admin_pro_msg_list from '../views/admin/pro_msg/list.vue';
	import staff_pro_msg_list from '../views/staff/pro_msg/list.vue';
	import admin_notice_list from '../views/admin/notice/list.vue';
	import staff_notice_list from '../views/staff/notice/list.vue';
	import admin_company_staff_list from '../views/admin/company_staff/list.vue';
	import staff_company_staff_list from '../views/staff/company_staff/list.vue';
	import gzw_personal from '../views/gzw/personal.vue';
	import jwsj_personal from '../views/jwsj/personal.vue';
	import staff_personal from '../views/staff/personal.vue';
	import admin_notice_detail from '../views/admin/notice/detail.vue';
	import staff_notice_detail from '../views/staff/notice/detail.vue';
	import alter_password from '../views/alter_password.vue';
	import admin_gzw_add from '../views/admin/gzw/add_page.vue';
	import admin_gzw_update from '../views/admin/gzw/update_page.vue';
	import gzw_gzw_update1 from '../views/gzw/gzw/update1_page.vue';
	import admin_jw_book_add from '../views/admin/jw_book/add_page.vue';
	import admin_jw_book_update from '../views/admin/jw_book/update_page.vue';
	import jwsj_jw_book_update1 from '../views/jwsj/jw_book/update1_page.vue';
	import admin_staff_add from '../views/admin/staff/add_page.vue';
	import admin_staff_update from '../views/admin/staff/update_page.vue';
	import staff_staff_update1 from '../views/staff/staff/update1_page.vue';
	import admin_pbzj_add from '../views/admin/pbzj/add_page.vue';
	import admin_pbzj_update from '../views/admin/pbzj/update_page.vue';
	import staff_pbzj_add1 from '../views/staff/pbzj/add1_page.vue';
	import staff_pbzj_update1 from '../views/staff/pbzj/update1_page.vue';
	import admin_cg_msg_shtg from '../views/admin/cg_msg/shtg_page.vue';
	import admin_cg_msg_shbtg from '../views/admin/cg_msg/shbtg_page.vue';
	import staff_cg_msg_add from '../views/staff/cg_msg/add_page.vue';
	import staff_cg_msg_update from '../views/staff/cg_msg/update_page.vue';
	import staff_cg_msg_wccg from '../views/staff/cg_msg/wccg_page.vue';
	import admin_zb_msg_add from '../views/admin/zb_msg/add_page.vue';
	import admin_zb_msg_update from '../views/admin/zb_msg/update_page.vue';
	import staff_zb_msg_add1 from '../views/staff/zb_msg/add1_page.vue';
	import staff_zb_msg_update1 from '../views/staff/zb_msg/update1_page.vue';
	import admin_yc_warning_update from '../views/admin/yc_warning/update_page.vue';
	import gzw_yc_warning_qryj from '../views/gzw/yc_warning/qryj_page.vue';
	import gzw_yc_warning_qxyj from '../views/gzw/yc_warning/qxyj_page.vue';
	import jwsj_yc_warning_add from '../views/jwsj/yc_warning/add_page.vue';
	import jwsj_yc_warning_update1 from '../views/jwsj/yc_warning/update1_page.vue';
	import admin_gys_msg_add from '../views/admin/gys_msg/add_page.vue';
	import admin_gys_msg_update from '../views/admin/gys_msg/update_page.vue';
	import staff_gys_msg_add1 from '../views/staff/gys_msg/add1_page.vue';
	import staff_gys_msg_update1 from '../views/staff/gys_msg/update1_page.vue';
	import admin_pro_msg_add from '../views/admin/pro_msg/add_page.vue';
	import admin_pro_msg_update from '../views/admin/pro_msg/update_page.vue';
	import staff_pro_msg_add1 from '../views/staff/pro_msg/add1_page.vue';
	import staff_pro_msg_update1 from '../views/staff/pro_msg/update1_page.vue';
	import admin_notice_add from '../views/admin/notice/add_page.vue';
	import admin_notice_update from '../views/admin/notice/update_page.vue';
	import admin_company_staff_add from '../views/admin/company_staff/add_page.vue';
	import admin_company_staff_update from '../views/admin/company_staff/update_page.vue';
	import staff_company_staff_add1 from '../views/staff/company_staff/add1_page.vue';
	import staff_company_staff_update1 from '../views/staff/company_staff/update1_page.vue';
	const  routes= [
{
	path: '/',
	component: sys_login,
	name:'sys_login0',
meta:{auth:true}
},
{
	path: '/sys_login',
	component: sys_login,
	name:'sys_login',
meta:{auth:true}
},
{
	path: '/home',
	component: home,
	name:'home',
meta:{auth:true}
},
{
	path: '/admin/index',
	component: admin_index,
	name:'admin_index',
meta:{auth:true}
},
{
	path: '/gzw/index',
	component: gzw_index,
	name:'gzw_index',
meta:{auth:true}
},
{
	path: '/jwsj/index',
	component: jwsj_index,
	name:'jwsj_index',
meta:{auth:true}
},
{
	path: '/staff/index',
	component: staff_index,
	name:'staff_index',
meta:{auth:true}
},
{
	path: '/admin/gzw/list',
	component: admin_gzw_list,
	name:'admin_gzw_list',
meta:{auth:true}
},
{
	path: '/admin/jw_book/list',
	component: admin_jw_book_list,
	name:'admin_jw_book_list',
meta:{auth:true}
},
{
	path: '/admin/staff/list',
	component: admin_staff_list,
	name:'admin_staff_list',
meta:{auth:true}
},
{
	path: '/admin/pbzj/list',
	component: admin_pbzj_list,
	name:'admin_pbzj_list',
meta:{auth:true}
},
{
	path: '/staff/pbzj/list',
	component: staff_pbzj_list,
	name:'staff_pbzj_list',
meta:{auth:true}
},
{
	path: '/admin/cg_msg/list',
	component: admin_cg_msg_list,
	name:'admin_cg_msg_list',
meta:{auth:true}
},
{
	path: '/staff/cg_msg/list',
	component: staff_cg_msg_list,
	name:'staff_cg_msg_list',
meta:{auth:true}
},
{
	path: '/admin/zb_msg/list',
	component: admin_zb_msg_list,
	name:'admin_zb_msg_list',
meta:{auth:true}
},
{
	path: '/staff/zb_msg/list',
	component: staff_zb_msg_list,
	name:'staff_zb_msg_list',
meta:{auth:true}
},
{
	path: '/admin/yc_warning/list',
	component: admin_yc_warning_list,
	name:'admin_yc_warning_list',
meta:{auth:true}
},
{
	path: '/gzw/yc_warning/list',
	component: gzw_yc_warning_list,
	name:'gzw_yc_warning_list',
meta:{auth:true}
},
{
	path: '/jwsj/yc_warning/list',
	component: jwsj_yc_warning_list,
	name:'jwsj_yc_warning_list',
meta:{auth:true}
},
{
	path: '/admin/gys_msg/list',
	component: admin_gys_msg_list,
	name:'admin_gys_msg_list',
meta:{auth:true}
},
{
	path: '/staff/gys_msg/list',
	component: staff_gys_msg_list,
	name:'staff_gys_msg_list',
meta:{auth:true}
},
{
	path: '/admin/pro_msg/list',
	component: admin_pro_msg_list,
	name:'admin_pro_msg_list',
meta:{auth:true}
},
{
	path: '/staff/pro_msg/list',
	component: staff_pro_msg_list,
	name:'staff_pro_msg_list',
meta:{auth:true}
},
{
	path: '/admin/notice/list',
	component: admin_notice_list,
	name:'admin_notice_list',
meta:{auth:true}
},
{
	path: '/staff/notice/list',
	component: staff_notice_list,
	name:'staff_notice_list',
meta:{auth:true}
},
{
	path: '/admin/company_staff/list',
	component: admin_company_staff_list,
	name:'admin_company_staff_list',
meta:{auth:true}
},
{
	path: '/staff/company_staff/list',
	component: staff_company_staff_list,
	name:'staff_company_staff_list',
meta:{auth:true}
},
{
	path: '/gzw/personal',
	component: gzw_personal,
	name:'gzw_personal',
meta:{auth:true}
},
{
	path: '/jwsj/personal',
	component: jwsj_personal,
	name:'jwsj_personal',
meta:{auth:true}
},
{
	path: '/staff/personal',
	component: staff_personal,
	name:'staff_personal',
meta:{auth:true}
},
{
	path: '/admin/notice/detail',
	component: admin_notice_detail,
	name:'admin_notice_detail',
meta:{auth:true}
},
{
	path: '/staff/notice/detail',
	component: staff_notice_detail,
	name:'staff_notice_detail',
meta:{auth:true}
},
{
	path: '/alter_password',
	component: alter_password,
	name:'alter_password',
meta:{auth:true}
},
{
	path: '/admin/gzw/add_page',
	component: admin_gzw_add,
	name:'admin_gzw_add',
meta:{auth:true}
},
{
	path: '/admin/gzw/update_page',
	component: admin_gzw_update,
	name:'admin_gzw_update',
meta:{auth:true}
},
{
	path: '/gzw/gzw/update1_page',
	component: gzw_gzw_update1,
	name:'gzw_gzw_update1',
meta:{auth:true}
},
{
	path: '/admin/jw_book/add_page',
	component: admin_jw_book_add,
	name:'admin_jw_book_add',
meta:{auth:true}
},
{
	path: '/admin/jw_book/update_page',
	component: admin_jw_book_update,
	name:'admin_jw_book_update',
meta:{auth:true}
},
{
	path: '/jwsj/jw_book/update1_page',
	component: jwsj_jw_book_update1,
	name:'jwsj_jw_book_update1',
meta:{auth:true}
},
{
	path: '/admin/staff/add_page',
	component: admin_staff_add,
	name:'admin_staff_add',
meta:{auth:true}
},
{
	path: '/admin/staff/update_page',
	component: admin_staff_update,
	name:'admin_staff_update',
meta:{auth:true}
},
{
	path: '/staff/staff/update1_page',
	component: staff_staff_update1,
	name:'staff_staff_update1',
meta:{auth:true}
},
{
	path: '/admin/pbzj/add_page',
	component: admin_pbzj_add,
	name:'admin_pbzj_add',
meta:{auth:true}
},
{
	path: '/admin/pbzj/update_page',
	component: admin_pbzj_update,
	name:'admin_pbzj_update',
meta:{auth:true}
},
{
	path: '/staff/pbzj/add1_page',
	component: staff_pbzj_add1,
	name:'staff_pbzj_add1',
meta:{auth:true}
},
{
	path: '/staff/pbzj/update1_page',
	component: staff_pbzj_update1,
	name:'staff_pbzj_update1',
meta:{auth:true}
},
{
	path: '/admin/cg_msg/shtg_page',
	component: admin_cg_msg_shtg,
	name:'admin_cg_msg_shtg',
meta:{auth:true}
},
{
	path: '/admin/cg_msg/shbtg_page',
	component: admin_cg_msg_shbtg,
	name:'admin_cg_msg_shbtg',
meta:{auth:true}
},
{
	path: '/staff/cg_msg/add_page',
	component: staff_cg_msg_add,
	name:'staff_cg_msg_add',
meta:{auth:true}
},
{
	path: '/staff/cg_msg/update_page',
	component: staff_cg_msg_update,
	name:'staff_cg_msg_update',
meta:{auth:true}
},
{
	path: '/staff/cg_msg/wccg_page',
	component: staff_cg_msg_wccg,
	name:'staff_cg_msg_wccg',
meta:{auth:true}
},
{
	path: '/admin/zb_msg/add_page',
	component: admin_zb_msg_add,
	name:'admin_zb_msg_add',
meta:{auth:true}
},
{
	path: '/admin/zb_msg/update_page',
	component: admin_zb_msg_update,
	name:'admin_zb_msg_update',
meta:{auth:true}
},
{
	path: '/staff/zb_msg/add1_page',
	component: staff_zb_msg_add1,
	name:'staff_zb_msg_add1',
meta:{auth:true}
},
{
	path: '/staff/zb_msg/update1_page',
	component: staff_zb_msg_update1,
	name:'staff_zb_msg_update1',
meta:{auth:true}
},
{
	path: '/admin/yc_warning/update_page',
	component: admin_yc_warning_update,
	name:'admin_yc_warning_update',
meta:{auth:true}
},
{
	path: '/gzw/yc_warning/qryj_page',
	component: gzw_yc_warning_qryj,
	name:'gzw_yc_warning_qryj',
meta:{auth:true}
},
{
	path: '/gzw/yc_warning/qxyj_page',
	component: gzw_yc_warning_qxyj,
	name:'gzw_yc_warning_qxyj',
meta:{auth:true}
},
{
	path: '/jwsj/yc_warning/add_page',
	component: jwsj_yc_warning_add,
	name:'jwsj_yc_warning_add',
meta:{auth:true}
},
{
	path: '/jwsj/yc_warning/update1_page',
	component: jwsj_yc_warning_update1,
	name:'jwsj_yc_warning_update1',
meta:{auth:true}
},
{
	path: '/admin/gys_msg/add_page',
	component: admin_gys_msg_add,
	name:'admin_gys_msg_add',
meta:{auth:true}
},
{
	path: '/admin/gys_msg/update_page',
	component: admin_gys_msg_update,
	name:'admin_gys_msg_update',
meta:{auth:true}
},
{
	path: '/staff/gys_msg/add1_page',
	component: staff_gys_msg_add1,
	name:'staff_gys_msg_add1',
meta:{auth:true}
},
{
	path: '/staff/gys_msg/update1_page',
	component: staff_gys_msg_update1,
	name:'staff_gys_msg_update1',
meta:{auth:true}
},
{
	path: '/admin/pro_msg/add_page',
	component: admin_pro_msg_add,
	name:'admin_pro_msg_add',
meta:{auth:true}
},
{
	path: '/admin/pro_msg/update_page',
	component: admin_pro_msg_update,
	name:'admin_pro_msg_update',
meta:{auth:true}
},
{
	path: '/staff/pro_msg/add1_page',
	component: staff_pro_msg_add1,
	name:'staff_pro_msg_add1',
meta:{auth:true}
},
{
	path: '/staff/pro_msg/update1_page',
	component: staff_pro_msg_update1,
	name:'staff_pro_msg_update1',
meta:{auth:true}
},
{
	path: '/admin/notice/add_page',
	component: admin_notice_add,
	name:'admin_notice_add',
meta:{auth:true}
},
{
	path: '/admin/notice/update_page',
	component: admin_notice_update,
	name:'admin_notice_update',
meta:{auth:true}
},
{
	path: '/admin/company_staff/add_page',
	component: admin_company_staff_add,
	name:'admin_company_staff_add',
meta:{auth:true}
},
{
	path: '/admin/company_staff/update_page',
	component: admin_company_staff_update,
	name:'admin_company_staff_update',
meta:{auth:true}
},
{
	path: '/staff/company_staff/add1_page',
	component: staff_company_staff_add1,
	name:'staff_company_staff_add1',
meta:{auth:true}
},
{
	path: '/staff/company_staff/update1_page',
	component: staff_company_staff_update1,
	name:'staff_company_staff_update1',
meta:{auth:true}
},
]
const router = createRouter({
	mode: 'history', // 设置为history模式
	history:createWebHistory(),
	base: process.env.BASE_URL,
	routes
})
export default router
