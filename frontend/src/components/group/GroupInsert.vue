<template>
    <div class="container-fluid">
    <Navbar></Navbar>
        
        <!-- Default form subscription -->
        <form class="text-center border border-light p-5">

            <p class="h4 mb-4">Add Group</p>

            <p>당신의 그룹을 만들어 보세요 </p>

            
            <!-- table -->
            <table class="table">
                
                <tbody>
                    <tr>
                    <th scope="row">Group Name</th>
                    <td>bit190603<input type="text"> </td>
                    </tr>

                    <tr>
                    <th scope="row">Group Introduce</th>
                    <td>비트캠프 서울시 뉴딜 일자리 자바스크립트 프레임위크 과정 <textarea name="" id="" cols="50" rows="3"></textarea></td>
                    </tr>

                    <tr>
                    <th scope="row">Group Leader</th>
                    <td>홍 길 동<input type="text"></td>
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