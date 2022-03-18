<template>
  <section class="Topbar">
    <div class="SearchDiv flex mt5">
      <div class="flex ml20 mt13 mb13">
        <img class="SearchImg" src="../assets/FrameLupa.png" />
      </div>
      <div class="flex mt13 mb13 mr200">
        <input class="Search" placeholder="Search" />
      </div>
    </div>
    <div class="BasketDiv">
      <img class="Basket" src="../assets/IconBasket.png" />
    </div>
    <div class="NotificationDiv">
      <img class="Notification" src="../assets/IconNotification.png" />
    </div>
    <div class="User">
      <div>
        <img class="UserImg" src="../assets/User.jpg" />
      </div>
      <div>
        <h3 class="ml10 mt25">User Name</h3>
      </div>
      <div>
        <img class="ml20 mt33" src="../assets/VectorArrowBottom.png" />
      </div>
    </div>
  </section>
</template>

<style>
.flex {
  display: flex;
}
.jbf {
  justify-content: space-between;
}
.Logo {
  margin-left: 50px;
  display: flex;
}
.icon {
  max-width: 26px;
  max-height: 26px;
}
.UserImg {
  margin-top: 12px;
  margin-left: 15px;
  max-width: 45px;
  max-height: 45px;
  border-radius: 8px;
}
.User {
  display: flex;
}
.elips {
  max-width: 13px;
  max-height: 13px;
}
.Topbar {
  max-height: 100%;
  max-width: 100%;
  display: flex;
}
.Sidbar {
  margin-left: 10px;
  margin-right: 80px;
  max-height: 100%;
  max-width: 100%;
}
.BasketDiv {
  margin-top: 12px;
  margin-left: 300px;
}
.Basket {
  width: 45px;
  height: 45px;
}
.NotificationDiv {
  margin-top: 12px;
  margin-left: 15px;
}
.Notification {
  width: 45px;
  height: 45px;
}
.SearchDiv {
  margin-left: 120px;
  background-color: #f8fafb;
  max-width: 850px;
  max-height: 55px;
  border-radius: 8px;
}
.Search {
  margin-left: 15px;
  margin-right: 250px;
  background-color: #f8fafb;
  border: none;
}
.SearchImg {
  max-width: 20px;
  max-height: 20px;
  margin-top: 5px;
}
.FocusMenuItem {
  margin-left: 10px;
  color: rgb(0, 81, 255);
  background: rgba(111, 178, 255, 0.336);
  border-radius: 8px;
}
.MenuItem {
  margin-left: 10px;
  color: #aeb9be;
  border-radius: 8px;
}
.MainNav {
  margin-top: 30px;
  margin-left: 20px;
  max-width: 270px;
  max-height: 550px;
}
.ServiceNav {
  margin-left: 20px;
  max-width: 270px;
  max-height: 350px;
}
.ml40 {
  margin-left: 40px;
}
.ml20 {
  margin-left: 20px;
}
.ml10 {
  margin-left: 10px;
}
.ml5 {
  margin-left: 5px;
}
.mt33 {
  margin-top: 33px;
}
.mt25 {
  margin-top: 25px;
}
.mt13 {
  margin-top: 13px;
}
.mt5 {
  margin-top: 5px;
}
.mb13 {
  margin-bottom: 13px;
}
.mr200 {
  margin-right: 200px;
}
.blue {
  color: rgb(0, 81, 255);
}
.black {
  color: black;
}
</style>
