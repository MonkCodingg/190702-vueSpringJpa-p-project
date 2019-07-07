<template>
    <div class="container-fluid">
        <Navbar></Navbar>
        <form class="text-center p-5" @submit.prevent>
            <!-- @submit.prevent="save" 동기처리 거부, 비동기로 처리하겠다 -->
            <p class="h2 mb-4">Woon Group Modify</p>
            <p>당신의 그룹 정보를 수정해 보세요. </p>
            <!-- table -->
            <table class="table text-left">
                <tbody>
                    <tr>
                    <th scope="row">Group No</th>
                    <td>{{this.$store.state.groupno}}</td>
                    </tr>
                    <tr>
                    <th scope="row">Group Name</th>
                    <td><input type="text" class="form-control" v-model="groupname" > </td>
                    </tr>

                    <tr>
                    <th scope="row">Group Introduce</th>
                    <td><textarea cols="50" rows="3" class="md-textarea form-control" v-model="groupintro">
                        </textarea></td>
                    </tr>

                    <tr>
                    <th scope="row">Group Leader</th>
                    <td><input type="text" class="form-control" v-model="groupleader"></td>
                    </tr>
                </tbody>
            </table>  
            <!-- Sign in button -->
            <button class="btn btn-info" @click='save()'>Save</button>
            <button class="btn btn-light" @click='cancel()'>Cancel</button>
        </form>
        <Footer></Footer>
    </div>
</template>
<script>
import Footer from '@/components/common/Footer.vue'
import Navbar from '@/components/common/Navbar.vue'
import axios from 'axios'
import {store} from '../../store'
export default {
    name: 'groupModify',
    components: {
        Navbar,
        Footer,
    },
    data () {
        return {
            context: 'http://localhost:9000/groups',
            groupno: this.$store.state.groupno,
            groupname: this.$store.state.groupname,
            groupintro: this.$store.state.groupintro,
            groupleader: this.$store.state.groupleader,
        }
    },
    methods: {
        save(){
            alert("수정 하시겠습니까?")
            let data ={
                groupname: this.groupname,
                groupintro: this.groupintro,
                groupleader: this.groupleader
            }
            let headers = {
                'Content-Type': 'application/json',
                'Authorization': 'JWT fefege..'
            }
            axios.put(`${this.context}/${this.groupno}`, 
                                    JSON.stringify(data), 
                                    {headers: headers}).then(res=>{
                //alert(`SUCCESS`) 
                this.$router.push('/group-list')
            })
            .catch(e=>{
                alert('ERROR')
            })
        },
        cancel(){
            this.$router.push('/group-list');
        }
    }    
}
</script>
<style scoped>
</style>
