<template>
  <div class="container-fluid">
    <Navbar></Navbar>
      
      <figure class="figure ">
        <img src="https://i.pinimg.com/originals/2b/aa/83/2baa839c9e22ceef0e75570c028b3eeb.jpg" class="figure-img img-fluid z-depth-1 text-center"
          alt="..." >
        <figcaption class="figure-caption"></figcaption>
    </figure>
    <Footer></Footer>
  </div>
</template>

<script>
import Footer from '@/components/common/Footer.vue'
import Navbar from '@/components/common/Navbar.vue'

import axios from 'axios'
export default {
  name: 'Home',
  components:{
    Navbar,
    Footer,
    
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
img {
  width: fit-content;
  
}
</style>
