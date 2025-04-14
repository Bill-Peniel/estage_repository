
<template>
    <div>
        <section class="section section-search">
            <img src="/assets/img/search-bg.png" class="background-img w-full h-full object-cover object-center absolute inset-0" alt="Search background">
            <div class="container-fluid">
                <div class="banner-wrapper">
                    <div class="banner-header text-center">
                        <h1 class="text-white">Recherches une Structure , Fais une demande de Stage</h1>
                        <p class="text-white">Découvres la ou le(s) structure(s) en adéquation avec ta formation.</p>
                    </div>
                </div>
            </div>
        </section>
    </div>
</template>

<script>
export default {
    name: 'SearchComponent'
}
</script>

<style>
.section-search {
    position: relative;
    min-height: 450px;
    width: 100%;
    overflow: hidden;
    padding: 80px 0;
}

.background-img {
    filter: brightness(0.5);
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    object-fit: cover;
    z-index: -1;
}

.banner-wrapper {
    margin: 0 auto;
    max-width: 800px;
    width: 100%;
    padding: 0 15px;
}

.banner-header {
    margin-bottom: 30px;
}

.banner-header h1 {
    margin-bottom: 20px;
    font-size: 40px;
    font-weight: 600;
    color: #fff;
}

.banner-header p {
    font-size: 20px;
    margin-bottom: 0;
    color: #fff;
}

@media (max-width: 991px) {
    .section-search {
        min-height: 400px;
        padding: 60px 0;
    }
    
    .banner-header h1 {
        font-size: 32px;
    }
    
    .banner-header p {
        font-size: 18px;
    }
}

@media (max-width: 767px) {
    .section-search {
        min-height: 350px;
        padding: 40px 0;
    }
    
    .banner-header h1 {
        font-size: 28px;
    }
    
    .banner-header p {
        font-size: 16px;
    }
}

@media (max-width: 479px) {
    .section-search {
        min-height: 300px;
        padding: 30px 0;
    }
    
    .banner-header h1 {
        font-size: 24px;
    }
    
    .banner-header p {
        font-size: 14px;
    }
}
</style>
