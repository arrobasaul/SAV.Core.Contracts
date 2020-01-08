/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SAV.Core.Contracts.Interfaces;

import SAV.Core.Contracts.Interfaces.Services.ModuleServices.IDataBroker;
import SAV.Core.Contracts.Interfaces.Services.ShellServices.IMessageBroker;
import SAV.Core.Contracts.Interfaces.Services.ShellServices.IServicePool;
import SAV.Core.Contracts.Interfaces.Services.ShellServices.IVisualModuleManager;
import SAV.Core.Contracts.Interfaces.Services.ShellServices.Logging.IImportPool;

/**
 *
 * @author savarela
 */
public interface IApplicationContext {
    public IDataBroker DataBroker();
    public IServicePool ServicePool ();
    public IMessageBroker MessageBroker ();
    public IImportPool ImportPool ();
    public IVisualModuleManager VisualModuleManager();
}
