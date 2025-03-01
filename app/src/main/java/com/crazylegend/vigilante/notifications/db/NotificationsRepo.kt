package com.crazylegend.vigilante.notifications.db

import javax.inject.Inject

/**
 * Created by crazy on 11/4/20 to long live and prosper !
 */
class NotificationsRepo @Inject constructor(private val dao: NotificationsDAO) {

    suspend fun getNotificationForID(withID: Int) = dao.getNotificationByID(withID)
    fun getAllNotifications() = dao.getAllNotifications()
    fun insertNotification(notificationsModel: NotificationsModel) = dao.insertNotificationModel(notificationsModel)
}