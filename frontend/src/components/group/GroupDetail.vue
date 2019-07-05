<template>
    <div class="container-fluid">
        <Navbar></Navbar>
        <div class="container">
        <section id="table-head-options">
            <p></p>
            <h2 class="section-heading mb-4">
                Woon Group Detail
            </h2>
            <div class="border-light p-5">
                <table class="table">
                
                    <tbody>
                        <tr>
                        <th scope="row">Group no</th>
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
            
                <button type="button" class="btn btn-info" @click='modify()'>update</button>
                <button type="button" class="btn btn-danger" @click='delet()'>delete</button>
                

            </div>
                
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
                    this.$router.push('/group-list')
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