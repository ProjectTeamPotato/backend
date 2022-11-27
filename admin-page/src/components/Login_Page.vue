<template>
    <v-container id="wrap">

        <v-form
            ref="form"
            v-model="valid"
            lazy-validation
        >
            <span id="title">
                인터파크 클론코딩 관리자 페이지
            </span>
            <v-text-field
            label="E-mail"
            required
            ></v-text-field>

            <v-text-field
            label="password"
            required
            ></v-text-field>

            <v-btn
            color="success"
            class="mr-4"
            @click="validate"
            >
            login
            </v-btn>

            <v-btn
            color="error"
            class="mr-4"
            @click="reset"
            >
            Reset Form
            </v-btn>
        </v-form>
    </v-container>
</template>
<style scoped>
    #title {
        display: flex;
        justify-content: center;
        margin: 40px;
    }
    #wrap {
        display: flex;
        justify-content: center;
        align-items:center;
        min-height: 100vh;
    }
    .v-form {
        width: 1000px;
    }
</style>
<script>
export default {
    setup() {
        
    },

    methods: {
        send_login() {
            
        }
    }
}
</script>
