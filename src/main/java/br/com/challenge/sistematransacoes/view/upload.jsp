        <form method="POST" action="${pageContext.request.contextPath}/importando-contatos" enctype="multipart/form-data">
            <div class="form-body">
                <div class="row p-t-20">
                    <div class="col-md-6">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label class="control-label">Upload de arquivo</label>
                                <input type="file" class="form-control" id="exampleInputFile" aria-describedby="fileHelp" name="arquivo">
                                <small class="form-control-feedback"> Carregue o seu arquivo aqui .txt ou .csv </small>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label class="control-label">Grupo</label>
                                <select class="form-control custom-select" data-placeholder="Choose a Category" tabindex="1" name="grupo">
                                    <c:forEach items="${grupoList}" var="list">
                                        <option value="${list.id}">${list.nome}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <h6 class="card-title">Grupos cadastrados</h6>
                        <div class="table-responsive">
                            <table class="table">
                                <tbody>
                                    <c:forEach items="${grupoList}" var="list">
                                        <tr>
                                            <td>${list.nome}</td>
                                            <td>${list.total} Contatos</td>
                                            <td><a href='#' class="text-muted"><i class="fa fa-eye"></i></a></td>
                                            <td><a href='#' class="text-muted"><i class="fa fa-pencil"></i></a></td>
                                            <td><a href='#' class="text-muted"><i class="fa fa-trash-o"></i></a></td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                <!--/row-->
            </div>
            <div class="form-actions">
                <button type="submit" class="btn btn-success"> <i class="fa fa-check"></i> Carregar</button>
            </div>
        </form>