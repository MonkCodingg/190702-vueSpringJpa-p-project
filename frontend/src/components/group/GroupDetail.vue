<template>
<div class="container-fluid">
    <Navbar></Navbar>
    <div class="container">
    <section id="table-head-options">
        <p></p>
        <h2 class="section-heading mb-4">
            Woon Group Detail
        </h2>
        <table class="table">
            
            <tbody>
                <tr>
                <th scope="row">1</th>
                <td>Mark</td>
                <td>Otto</td>
                <td>@mdo</td>
                </tr>
                <tr>
                <th scope="row">2</th>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>@fat</td>
                </tr>
                <tr>
                <th scope="row">3</th>
                <td>Larry</td>
                <td>the Bird</td>
                <td>@twitter</td>
                </tr>
            </tbody>
        </table>    
    </section>
    </div>
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