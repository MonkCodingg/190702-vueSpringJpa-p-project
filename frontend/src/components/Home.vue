<template>
  <!-- Jumbotron -->
<div class="container-fluid">
<Navbar></Navbar>
<!-- Jumbotron -->
<div class="jumbotron text-center">

  <!-- Title -->
  <h2 class="card-title h2">개인 프로젝트</h2>
  <!-- Subtitle -->
  <p class="blue-text my-4 font-weight-bold">Group에 대한 CRUD 구현</p>

  <!-- Grid row -->
  <div class="row d-flex justify-content-center">

    <!-- Grid column -->
    <div class="col-xl-7 pb-2">

      

    </div>
    <!-- Grid column -->

  </div>
  <!-- Grid row -->

  <hr class="my-4">

  <div class="pt-2">
    <p class="card-text">Vue.js, Spring Boot, JPA, H2  </p>
  </div>

</div>
<!-- Jumbotron -->
<Footer></Footer>

<!-- Jumbotron -->
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
      
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
