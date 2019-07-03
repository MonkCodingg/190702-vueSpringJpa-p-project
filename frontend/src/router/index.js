import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import GroupList from '@/components/group/GroupList'
import GroupDetail from '@/components/group/GroupDetail'
import GroupModify from '@/components/group/GroupModify'
import GroupInsert from '@/components/group/GroupInsert'
Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {path: '/', name: 'Home', component: Home},
    {path: '/group-list', name: 'group-list', component: GroupList},
    {path: '/group-detail', name: 'group-detail', component: GroupDetail},
    {path: '/group-modify', name: 'group-modify', component: GroupModify},
    {path: '/group-insert', name: 'group-insert', component: GroupInsert},
    
    
  ]
})
