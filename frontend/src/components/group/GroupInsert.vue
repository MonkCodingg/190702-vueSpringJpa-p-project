<template>
    <div class="container-fluid">
    <Navbar></Navbar>
        <!-- Default form subscription -->
        <form class="text-center border border-light p-5" @submit.prevent="save">
            <!-- @submit.prevent="save" 동기처리 거부, 비동기로 처리하겠다 -->
            <p class="h2 mb-4">Add Group</p>
            <p>당신의 그룹을 만들어 보세요 </p>
            <!-- table -->
            <table class="table text-left">    
                <tbody>
                    <tr>
                    <th scope="row">Group Name</th>
                    <td>
                        <input type="text" id="form1" class="form-control" v-model="groupname" > 
                    </td>
                    </tr>

                    <tr>
                    <th scope="row">Group Introduce</th>
                    <td>
                        <textarea cols="50" rows="3" class="form-control" v-model="groupintro"></textarea>
                    </td>
                    </tr>

                    <tr>
                    <th scope="row">Group Leader</th>
                    <td><input type="text" class="form-control" v-model="groupleader"></td>
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
    data: ()=>{
        return {
            context: 'http://localhost:9000/groups',
            groupname: '',
            groupintro: '',
            groupleader: '',
        }
    },
    components: {
        Navbar,
        Footer,
    },
    methods: {
        save(){
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
                this.$router.push("/group-list")
            }).catch(e=>{
                alert('ERROR')
                this.$router.link(-1);
            })
        },
    }    
}
</script>
<style scoped>

</style>