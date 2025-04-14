<template>
    <div class="admin">  
        <HeaderAdmin/>
        <router-view/>
        <FooterAdmin/>
    </div>
</template>

<script>
import HeaderAdmin from '@/components/HeaderAdmin.vue';
import FooterAdmin from '@/components/FooterAdmin.vue';

export default {
    name: 'AdminLayout',
    components :{
        HeaderAdmin,FooterAdmin
    }
}
</script>

<style>
</style>