/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAV.Core.Contracts.Interfaces.Services.ShellServices.Logging;

import java.util.Dictionary;

/**
 *
 * @author savarela
 */
public abstract interface ILogEntry {
    String Name ();
    Dictionary<String, Object> Messages ();
}
