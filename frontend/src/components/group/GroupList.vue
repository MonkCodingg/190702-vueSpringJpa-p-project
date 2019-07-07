<template>
    <div class="container-fluid">
        <Navbar></Navbar>
            <div class="container p-5">
                <!-- Content here -->
                <section id="table-head-options">
                    <p></p>
                    <h2 class="section-heading mb-4 text-center">
                        Woon Group List
                    </h2>
                    <p class="text-right">
                        <router-link to="/group-insert">
                            <button type="button" class="btn btn-primary">Create Group</button>
                        </router-link>
                    </p>
                    
                    <table class="table table-hover">
                        <thead class="black white-text">
                            <tr>
                            <th scope="col">Group No.</th>
                            <th scope="col">Group Name</th>
                            <th scope="col">Group Introduce</th>
                            <th scope="col">Group Leader</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="(item,index) in list" v-bind:key="index" @click="groupDetail(item)">
                            <!-- v-for 첫번째 인자 list 객체, 2번째 인자는 index값 0 1 2 3 4..로 증가-->
                                <th scope="row">{{index+1}}</th>
                                <!-- index는 0부터 시작하므로 +1-->
                                <td>{{item.groupname}}</td>
                                <td>{{item.groupintro}}</td>
                                <td>{{item.groupleader}}</td>
                            </tr>  
                        </tbody>    
                    </table>   
                </section> 
            </div> 
        <Footer></Footer>
    </div>
</template>
<script>
import Footer from '@/components/common/Footer.vue'
import Navbar from '@/components/common/Navbar.vue'
import axios from 'axios'
import {store} from '../../store'
export default {
    name: 'grouplist',
    data(){
        return {
           context: 'http://localhost:9000/groups',
           list:[] 
        }
    },
    components: {
        Navbar,
        Footer,
    },
    methods: {
        groupDetail(item){
            store.state.groupno = item.groupno;
            store.state.groupname = item.groupname;
            store.state.groupintro = item.groupintro;
            store.state.groupleader = item.groupleader;
            
            this.$router.push('/group-detail')
        },
        count(){
            let headers = {
                'Content-Type': 'application/json',
                'Autorization': 'JWT fefege..'
            }
            axios.get(`${this.context}/count`)
            .then(res=>{
                alert(`SUCCESS: ${res.data}`)   
            })
            .catch(e=>{
                alert('ERROR')
            })
        },   
    },
    created:function(){
        
        axios.get(`${this.context}`).then((res)=>{
            
            this.list = res.data;
        })
    }
}
</script>

<style scoped>

</style>
