<template>
<div class="container">
  <!-- Content here -->
  <section id="table-head-options">
      <p></p>
        <h2 class="section-heading mb-4">
            Woon Group List
        </h2>
        <p class="text-right">
            <router-link to="/group-insert">
                <button type="button" class="btn btn-primary">Add Group</button>
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
            <tr v-for="item in list" v-bind:key="item.groupno"  @click="groupDetail(item)">
                <th scope="row">{{item.groupno}}</th>
                <td>{{item.groupname}}</td>
                <td>{{item.groupintro}}</td>
                <td>{{item.groupleader}}</td>
            </tr>
            
            
        </tbody>
        
    </table>
    
  </section>
  
</div>    
</template>
<script>
import axios from 'axios'
import {store} from '../../store'
export default {
    
    data(){
        return {
           context: 'http://localhost:9000/groups',
           list:[] 
        }
    },
    components: {
       
    },
    methods: {
        groupDetail(item){
            store.state.groupno = item.groupno;
            store.state.groupname = item.groupname;
            store.state.groupintro = item.groupintro;
            store.state.groupleader = item.groupleader;
            alert("groupDetail 함수 클릭 \n 그룹이름은 :"+store.state.groupname);
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
