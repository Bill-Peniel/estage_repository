<template>
    <body>

<!-- Main Wrapper -->
<div class="main-wrapper">
    <!-- /Header -->
    
    <!-- Breadcrumb -->
    <div class="breadcrumb-bar">
        <div class="container-fluid">
            <div class="row align-items-center">
                <div class="col-md-12 col-12">
                    <nav aria-label="breadcrumb" class="page-breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="index-2.html">Home</a></li>
                            <li class="breadcrumb-item active" aria-current="page">Tableau de Bord</li>
                        </ol>
                    </nav>
                    <h2 class="breadcrumb-title">Tableau de Bord</h2>
                </div>
            </div>
        </div>
    </div>
    <!-- /Breadcrumb -->
    
    <!-- Page Content -->
    <div class="content">
        <div class="container-fluid">

            <div class="row">
                <div class="col-md-5 col-lg-4 col-xl-3 theiaStickySidebar">
                    
                    <!-- Profile Sidebar -->
                    <div class="profile-sidebar">
                        <div class="widget-profile pro-widget-content">
                            <div class="profile-info-widget">
                                <a href="#" class="booking-doc-img">
                                    <img src="assets/img/doctors/doctor-thumb-02.jpg" alt="User Image">
                                </a>
                                <div class="profile-det-info">
                                    <h3>Dr. Darren Elder</h3>
                                    
                                    <div class="patient-details">
                                        <h5 class="mb-0">BDS, MDS - Oral & Maxillofacial Surgery</h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="dashboard-widget">
                            <nav class="dashboard-menu">
                                <ul>
                                    <li class="active">
                                        <router-link to="/Admin/Dashboard">
                                            <i class="fas fa-columns"></i>
                                            <span>Tableau de Bord</span>
                                        </router-link>
                                    </li>
                                    <!-- <li>
                                        <a href="appointments.html">
                                            <i class="fas fa-calendar-check"></i>
                                            <span>Appointments</span>
                                        </a>
                                    </li> -->
                                    <li>
                                        <router-link to="/Admin/users/userstg">
                                            <i class="fas fa-user-injured"></i>
                                            <span>Mes Stagiaires</span>
                                        </router-link>
                                    </li>
                                    <!-- <li>
                                        <a href="schedule-timings.html">
                                            <i class="fas fa-hourglass-start"></i>
                                            <span>Schedule Timings</span>
                                        </a>
                                    </li> -->
                                    <!-- <li>
                                        <a href="invoices.html">
                                            <i class="fas fa-file-invoice"></i>
                                            <span>Invoices</span>
                                        </a>
                                    </li> -->
                                    <li>
                                        <router-link to="/Admin/AffecStagiaires">
                                            <i class="fas fa-star"></i>
                                            <span>Affectation de stagiaires </span>
                                        </router-link>
                                    </li>
                                    <!-- <li>
                                        <a href="chat-doctor.html">
                                            <i class="fas fa-comments"></i>
                                            <span>Message</span>
                                            <small class="unread-msg">23</small>
                                        </a>
                                    </li> -->
                                    <li>
                                        <router-link to="admin/users/edit">
                                            <i class="fas fa-user-cog"></i>
                                            <span>Modifier Profile </span>
                                        </router-link>
                                    </li>
                                    <li>
                                        <router-link to="/Admin/ThemeMemoire">
                                            <i class="fas fa-share-alt"></i>
                                            <span>Thèmes de mémoire</span>
                                        </router-link>
                                    </li>
                                    <li>
                                        <router-link to="/Admin/users/usereditpass">
                                            <i class="fas fa-lock"></i>
                                            <span>Modifier Mot de Passe</span>
                                        </router-link>
                                    </li>
                                    <li>
                                        <router-link to="/login">
                                            <i class="fas fa-sign-out-alt"></i>
                                            <span>Logout</span>
                                        </router-link>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                    </div>
                    <!-- /Profile Sidebar -->
                    
                </div>
                
                <div class="col-md-7 col-lg-8 col-xl-9">

                    <div class="row">
                        <div class="col-md-12">
                            <div class="card dash-card">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-md-12 col-lg-4">
                                            <div class="dash-widget dct-border-rht">
                                                <div class="circle-bar circle-bar1">
                                                    <div class="circle-graph1" data-percent="75">																
                                                        <font-awesome-icon icon="fa-light fa-screen-users"/>
                                                    </div>
                                                </div>
                                                <div class="dash-widget-info">
                                                    <h6>Stagiaires</h6>
                                                    <h3>1500</h3>
                                                    <p class="text-muted">Till Today</p>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        <div class="col-md-12 col-lg-4">
                                            <div class="dash-widget dct-border-rht">
                                                <div class="circle-bar circle-bar2">
                                                    <div class="circle-graph2" data-percent="65">																
                                                        <font-awesome-icon icon="fa-light fa-screen-users"/>
                                                    </div>
                                                </div>
                                                <div class="dash-widget-info">
                                                    <h6>Stagiaires en cours</h6>
                                                    <h3>160</h3>
                                                    <p class="text-muted">06, Nov 2019</p>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        <div class="col-md-12 col-lg-4">
                                            <div class="dash-widget">
                                                <div class="circle-bar circle-bar3">
                                                    <div class="circle-graph3" data-percent="50">																
                                                        <font-awesome-icon icon="fa-light fa-screen-users"/>
                                                    </div>
                                                </div>
                                                <div class="dash-widget-info">
                                                    <h6>Stagiaires terminés </h6>
                                                    <h3>85</h3>
                                                    <p class="text-muted">06, Apr 2019</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                    <div class="row">
                        <div class="col-md-12">
                            <div>        
                                <h1>Modifier Mot de Passe</h1>
                                <form @submit.prevent="edit">
                                    <div class="form-group form-focus">
                                        <input class="form-control floating" type="password" id="user_password"/>
                                        <label class="focus-label" for="user_password">Ancien Mot de passe</label>
                                    </div>
                                    <div class="form-group form-focus">
                                        <input class="form-control floating" type="password" id="user_password"/>
                                        <label class="focus-label" for="user_password">Nouveau Mot de passe</label>
                                    </div>
                                    <div class="form-group form-focus">
                                        <input class="form-control floating" type="password" id="user_password"/>
                                        <label class="focus-label" for="user_password">Confirmer le nouveau Mot de passe</label>
                                    </div>
            
                                    <div class="form-group form-focus">
                                        <button type="submit" class="btn btn-primary btn-block btn-lg login-btn">Modifier</button>
                                    </div>
                                </form>
                            </div>
                                
                        </div>
                    </div>

                </div>
            </div>

        </div>

    </div>		
    <!-- /Page Content -->
    <!-- /Footer -->
   
</div>
<!-- /Main Wrapper -->


</body>
</template>

<script>
export default {
    name: 'UserEditPass'
}
</script>

<style>
    
</style>