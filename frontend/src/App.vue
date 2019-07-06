<template>
  <div id="app">
    
    <router-view/>
  </div>
</template>

<script>
addEventListener("load", function(){
  setTimeout(()=>{
    window.scrollTo(0,1);
  }, 0);
}, false);
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;  
  color: #2c3e50;
  height:100%;
  text-align: center;
}

</style>
