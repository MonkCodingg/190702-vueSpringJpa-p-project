<template>
<div class="container">
    <Navbar></Navbar>
    <section id="table-head-options">
        <p></p>
        <h2 class="section-heading mb-4">
            Woon Group Detail
        </h2>
        
    </section>
    <Footer></Footer>
  
</div>    
</template>
<script>
import Footer from '@/components/common/Footer.vue'
import Navbar from '@/components/common/Navbar.vue'

export default {
    name: 'groupDetail',
    components: {
        Navbar,
        Footer,
        
    },
    data () {
        return {

        }
    }
}
</script>

<style scoped>

</style>