<template>
  <div class="container-fluid">
    <Navbar></Navbar>
    <GroupList></GroupList>
    <Footer></Footer>
  </div>
</template>

<script>
import Footer from '@/components/common/Footer.vue'
import Navbar from '@/components/common/Navbar.vue'
import GroupList from '@/components/group/GroupList.vue'
import axios from 'axios'
export default {
  name: 'Home',
  components:{
    Navbar,
    Footer,
    GroupList,
    
  },
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
