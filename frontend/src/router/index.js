import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import GroupList from '@/components/group/GroupList'
import GroupDetail from '@/components/group/GroupDetail'
Vue.use(Router)

export default new Router({
  routes: [
    {path: '/', name: 'Home', component: Home},
    {path: '/group-list', name: 'group-list', component: GroupList},
    {path: '/group-detail', name: 'group-detail', component: GroupDetail},
  ]
})
