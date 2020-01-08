/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAV.Core.Contracts.Interfaces.Services.ShellServices.Logging;

import java.util.List;

/**
 *
 * @author savarela
 */
public interface IImportPool {
    List<ILogEntry> LogEntries ();

        /// <summary>
        ///     Raised when a property on this object has a new value
        /// </summary>
    //event PropertyChangedEventHandler PropertyChanged;
}
