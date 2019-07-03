<template>
    <div class="container-fluid">
    <Navbar></Navbar>
        
        <!-- Default form subscription -->
        <form class="text-center border border-light p-5" @submit.prevent="save">
            <p class="h4 mb-4">Add Group</p>
            <p>당신의 그룹을 만들어 보세요 </p>
            <!-- table -->
            <table class="table">
                
                <tbody>
                    <tr>
                    <th scope="row">Group Name</th>
                    <td><input type="text" v-model="groupname"> </td>
                    </tr>

                    <tr>
                    <th scope="row">Group Introduce</th>
                    <td><textarea cols="50" rows="3" v-model="groupintro"></textarea></td>
                    </tr>

                    <tr>
                    <th scope="row">Group Leader</th>
                    <td><input type="text" v-model="groupleader"></td>
                    </tr>

                </tbody>
            </table>  

            <!-- Sign in button -->
            <button class="btn btn-info btn-block" type="submit">Create Group</button>

            
        </form>
<!-- Default form subscription -->
    <Footer></Footer>
    </div>
    
</template>
<script>
import Footer from '@/components/common/Footer.vue'
import Navbar from '@/components/common/Navbar.vue'
import axios from 'axios'
export default {
    name: 'groupInsert',
    components: {
        Navbar,
        Footer,
        
    },
    data: ()=>{
        return {
            context: 'http://localhost:9000/groups',
            groupname: '',
            groupintro: '',
            groupleader: '',
        }
    },
    methods: {

        save(){
            alert("create 함수 진입")
            let data = {
                groupname: this.groupname, //key : 현재 입력값
                groupintro: this.groupintro,
                groupleader: this.groupleader,
            }
            let headers = {
                'Content-Type': 'application/json',
                'Authorization': 'JWT fefege..'
            }
            axios.post(`${this.context}`, JSON.stringify(data), {headers: headers})
            .then(res=>{
                alert(`SUCCESS: ${res.data.result}`)
            }).catch(e=>{
                alert('ERROR')
            })
        },
    }    
}
</script>
<style scoped>

</style>