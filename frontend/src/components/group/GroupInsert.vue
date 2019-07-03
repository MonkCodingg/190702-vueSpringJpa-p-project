<template>
    <div class="container-fluid">
    <Navbar></Navbar>
        <!-- Default form subscription -->
        <form class="text-center border border-light p-5">

            <p class="h4 mb-4">Add Group</p>

            <p>당신의 그룹을 만들어 보세요 </p>

            <!-- Name -->
            <p class="text-left"><label for="exampleFormControlTextarea2">Group Name</label></p>
            <input type="text" id="defaultSubscriptionFormPassword" class="form-control mb-4" placeholder="Group Name">

            <div class="form-group">
                <p class="text-left"><label for="exampleFormControlTextarea2">Group Intoduce</label></p>
                <textarea class="form-control rounded-0" id="exampleFormControlTextarea2" rows="3" placeholder="Group Introduce"></textarea>
            </div>

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