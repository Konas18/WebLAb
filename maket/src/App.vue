// макет
https://www.figma.com/file/ljYL6wW2M69AKT4avaH1IK/Sales-Management-Dashboard-(Community)?node-id=8%3A485
<template>
  <div id="app" class="flex fullbackground">
    <div>
      <Sidebar></Sidebar>
    </div>
    <div class="full">
      <TopBar></TopBar>
      <div class="mainContent-div">
        <Analytics></Analytics>
        <Charts></Charts>
        <RecentOrder></RecentOrder>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
/*eslint-disable*/
import { Component, Vue } from "vue-property-decorator";
import Sidebar from "./components/Sidebar.vue";
import TopBar from "./components/TopBar.vue";
import Analytics from "./components/Analytics.vue";
import Charts from "./components/Charts.vue";
import RecentOrder from "./components/RecentOrders.vue";

@Component({
  components: {
    Sidebar,
    TopBar,
    Analytics,
    Charts,
    RecentOrder,
  },
})
export default class App extends Vue {}
</script>
<style></style>
