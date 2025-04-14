<template>
    <div class="public">
        <HeaderComponent/> 
        <router-view/>
        <FooterComponent/>
    </div>
</template>

<script>

import HeaderComponent from '@/components/HeaderComponent.vue';
import FooterComponent from '@/components/FooterComponent.vue';
export default {
    name: 'PublicLayout',
    components: {
    HeaderComponent, FooterComponent
  }
}
</script>

<style>
</style>