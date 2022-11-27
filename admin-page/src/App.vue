<template>
  <v-app>
    <v-main>
      <Login_Page/>
    </v-main>
  </v-app>
</template>

<script>
import Login_Page from './components/Login_Page.vue'

export default {
  name: 'App',

  components: {
    Login_Page,
  },

  data: () => ({
    //
  }),
}
</script>
