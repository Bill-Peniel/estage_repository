import { createRouter, createWebHistory } from 'vue-router'

import * as Public from '@/views/public'

import * as Admin from '@/views/admin'

import Login from '../views/auth/Login.vue'

import Demande from '@/views/public/Demande.vue'
import Contact from '@/views/public/Contact.vue'

const routes = [
  {
    path: '/',
    name: 'public',
    component: Public.PublicLayout,
    children: [
      { path: '/', name: 'acceuil', component: Public.Acceuil },
      { path: '/demande', name: 'demande', component: Public.Demande },
      { path: '/contact', name: 'contact', component: Public.Contact }
    ]
  },
  {
    path: '/admin',
    name: 'admin',
    component: Admin.AdminLayout,    
    children: [
      { path: 'dashboard', name: 'dashboard', component: Admin.Dashboard },

      { path: 'users/index', name: 'uList', component: Admin.UserIndex },
      { path: 'users/edit/:id(\\d+)', name: 'uEdit', component: Admin.UserEdit, props: true },
      { path: 'users/add', component: Admin.UserAdd },
      { path: 'users/userstg', component: Admin.UserStg },
      { path: 'users/usereditpass', component: Admin.UserEditPass }
    ]
  },
  {
     path: '/login', 
     name: 'Login', 
     component: Login
  },
  {
    path: '/demande', 
    name: 'Demande', 
    component: Demande
 },
 {
  path: '/contact', 
  name: 'Contact', 
  component: Contact
},
  {
    path: '/:pathMatch(.*)*', redirect: '/'
  }

  // {
  //   path: '/about',
  //   name: 'about',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: function () {
  //     return import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  //   }
  // }

]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
