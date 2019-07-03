<template>
    <div class="container-fluid">
        <Navbar></Navbar>
        <div class="container">
        <section id="table-head-options">
            <p></p>
            <h2 class="section-heading mb-4">
                Woon Group Modify
            </h2>
            <form class="text-center border border-light p-5">
                <table class="table">
                
                    <tbody>
                        <tr>
                        <th scope="row">Group Name</th>
                        <td>bit190603<input type="text"></td>
                        </tr>

                        <tr>
                        <th scope="row">Group Introduce</th>
                        <td>비트캠프 서울시 뉴딜 일자리 자바스크립트 프레임위크 과정<textarea name="" id="" cols="50" rows="3"></textarea></td>
                        </tr>

                        <tr>
                        <th scope="row">Group Leader</th>
                        <td>홍 길 동<input type="text"></td>
                        </tr>

                    </tbody>
                </table>
            </form>
                
        </section>
        </div>
        <Footer></Footer>
    </div>

</template>
<script>
import Footer from '@/components/common/Footer.vue'
import Navbar from '@/components/common/Navbar.vue'

export default {
    name: 'groupModify',
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
