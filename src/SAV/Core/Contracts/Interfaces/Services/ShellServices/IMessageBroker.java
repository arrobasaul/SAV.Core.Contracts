/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAV.Core.Contracts.Interfaces.Services.ShellServices;

import javax.swing.Action;

/**
 *
 * @author savarela
 */
public interface IMessageBroker<T> {
     void Publish(T message);
     void AddReceiver(Action callback);
}
