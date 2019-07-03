<template>
<div class="container">
  <!-- Content here -->
  <section id="table-head-options">
      <p></p>
      <h2 class="section-heading mb-4">
          Woon Group List
      </h2>
      <p class="text-right"><button type="button" class="btn btn-primary">Group Add</button></p>
      
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
            <tr>
                <th scope="row">1</th>
                <td>bit190603</td>
                <td>비트캠프 서울시 뉴딜 일자리 자바스크립트 프레임워크 과정</td>
                <td>홍길동</td>
            </tr>
            <tr>
                <th scope="row">1</th>
                <td>bit190603</td>
                <td>비트캠프 서울시 뉴딜 일자리 자바스크립트 프레임워크 과정</td>
                <td>홍길동</td>
            </tr>
            
        </tbody>
        
    </table>
    
  </section>
  
</div>    
</template>
<script>

export default {
    name: 'groupList',
    components: {
       
    },
    data () {
        return {

        }
    }
}
</script>

<style scoped>

</style>
