<template>
        <!--Navbar-->
    <nav class="navbar navbar-expand-lg navbar-dark primary-color">

    <!-- Navbar brand -->
    <a class="navbar-brand" href="">Woon</a>

    <!-- Collapse button -->
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#basicExampleNav"
        aria-controls="basicExampleNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <!-- Collapsible content -->
    <div class="collapse navbar-collapse" id="basicExampleNav">

        <!-- Links -->
        <ul class="navbar-nav mr-auto">
            
        <li class="nav-item active">
            <routerLink to="/">
                <a class="nav-link" >Home<span class="sr-only">(current)</span></a>
            </routerLink>
        </li>
        <li class="nav-item">
            <router-link to="/group-list">
                <a class="nav-link" >Group List </a>
            </router-link>
        </li>
        <!-- <li class="nav-item">
            <router-link to="/group-detail">
                <a class="nav-link" >Group Detail </a>
            </router-link>
        </li>
        <li class="nav-item">
            <router-link to="/group-modify">
                <a class="nav-link">Group Modify </a>
            </router-link>
        </li> 
        <li class="nav-item">
            <router-link to="/group-insert">
                <a class="nav-link">Group Insert </a>
            </router-link>
        </li> -->

        </ul>
        
    </div>
    <!-- Collapsible content -->

    </nav>
    <!--/.Navbar-->

</template>
<script>
export default {
    
}
</script>
<style scoped>

</style>
