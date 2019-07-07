<template>
    <div class="container-fluid">
        <Navbar></Navbar>
        <div class="container">
            <div class="text-center p-5" >
            <!-- @submit.prevent="save" 동기처리 거부, 비동기로 처리하겠다 -->
                <p class="h2 mb-4">Woon Group Detail</p>
                <p>당신의 그룹 상세정보를 확인하세요. </p>
                <!-- table -->
                <table class="table text-left">
                    <tbody>
                        <tr>
                        <th scope="row">Group No</th>
                        <td>{{this.$store.state.groupno}}</td>
                        </tr>
                        <tr>
                        <th scope="row">Group Name</th>
                        <td>{{this.$store.state.groupname}}</td>
                        </tr>

                        <tr>
                        <th scope="row">Group Introduce</th>
                        <td>{{this.$store.state.groupintro}}</td>
                        </tr>

                        <tr>
                        <th scope="row">Group Leader</th>
                        <td>{{this.$store.state.groupleader}}</td>
                        </tr>

                    </tbody>
                </table>          
            </div>
            <p class="text-center">
                <button type="button" class="btn btn-info" @click='modify()'>modify</button>
                <button type="button" class="btn btn-danger" @click='delet()'>delete</button>
            </p>
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
    name: 'groupDetail',
    components: {
        Navbar,
        Footer,   
    },
    data () {
        return {
            context: 'http://localhost:9000/groups',
            groupno: this.$store.state.groupno
        }
    },
    methods: {
        delet(){
            let cnf = confirm("그룹을 삭제하시겠습니까?");
            if(cnf){
                axios.delete(`${this.context}/${this.groupno}`)
                .then(res=>{
                    alert(`SUCCESS`)
                    // store에 저장된 정보 삭제하기
                    this.$store.state.groupno='';
                    this.$store.state.groupname='';
                    this.$store.state.groupintro='';
                    this.$store.state.groupleader='';
                    this.$router.push('/group-list')
                    console.log(this.$store.state);
                })
                .catch(e=>{
                    alert('ERROR')
                })
            }
        },
        modify(){
            this.$router.push('/group-modify')
        }
    }
}
</script>
<style scoped>

</style>