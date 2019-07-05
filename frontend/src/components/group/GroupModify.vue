<template>
    <div class="container-fluid">
        <Navbar></Navbar>
        <div class="container">
        <section id="table-head-options">
            <p></p>
            <h2 class="section-heading mb-4">
                Woon Group Modify
            </h2>
            <form class=" border border-light p-5">
                <table class="table">
                
                    <tbody>
<tr>
                        <th scope="row">Group No</th>
                        <td>{{this.$store.state.groupno}}</td>
                        </tr>

                        <tr>
                        <th scope="row">Group Name</th>
                        <td><input type="text" v-model='groupname'></td>
                        </tr>

                        <tr>
                        <th scope="row">Group Introduce</th>
                        <td><textarea name="" id="" cols="50" rows="3" v-model='groupintro'></textarea></td>
                        </tr>

                        <tr>
                        <th scope="row">Group Leader</th>
                        <td><input type="text" v-model='groupleader'></td>
                        </tr>

                    </tbody>
                </table>
                <button class="btn btn-info" @click='modify()'>update</button>
            </form>
                
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
        modify(){
            let data ={
                groupname: this.groupname,
                groupintro: this.groupintro,
                groupleader: this.groupleader
            }
            let headers = {
                'Content-Type': 'application/json',
                'Authorization': 'JWT fefege..'
            }
            axios.put(`${this.context}/${this.groupno}`, JSON.stringify(data), {headers: headers}).then(res=>{
                alert(`SUCCESS`) 
                this.$router.push('/group-list')
            })
            .catch(e=>{
                alert('ERROR')
            })
        }
    }    
}
</script>
<style scoped>

</style>
