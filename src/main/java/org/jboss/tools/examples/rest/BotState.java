/*liệt kê:*/
package org.jboss.tools.examples.rest;

/**
 * An enumeration that represents the possible states for the Bot.
 * 
 * @author Vineet Reynolds
 * 
 */
public enum BotState {
    RUNNING, NOT_RUNNING, RESET
}
/*Các RUNNING và NOT_RUNNING giá trị là hiển nhiên. 
 Các RESET giá trị được sử dụng để đại diện cho nhà nước, nơi Bot sẽ dừng lại và đặt chỗ sẽ bị xóa. 
 Hoàn toàn tự nhiên, các Bot cuối cùng sẽ nhập NOT_RUNNING nhà nước sau khi được RESET .*/